package com.cts.ws.impl;

import java.math.BigDecimal;
import java.util.List;

import com.cts.aspect.CheckAuthority;
import com.cts.request.BillRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dto.BillDto;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.BillService;
import com.cts.ws.BillWebService;

@Service
public class BillWebServiceImpl implements BillWebService {

	@Autowired
	private BillService billService;

	@Override
	@CheckAuthority
	public CtsResponse getBills(int ticketId) {
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(billService.getBills(ticketId));
		return response;
	}

	@Override
	@CheckAuthority
	public CtsResponse saveBills(BillRequest request) {
		long ticketId = request.getTicketId();
		List<BillDto> bills = request.getBills();
		for (BillDto bill : bills) {
			bill.setTicketId(ticketId);
			BigDecimal unitPrice = bill.getUnitPrice();
			if (unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0) {
				bill.setTotalPrice(BigDecimal.ZERO);
			} else {
				int ton = bill.getTon();
				BigDecimal tonDecimal = BigDecimal.valueOf(ton);
				bill.setTotalPrice(unitPrice.multiply(tonDecimal));
			}

			BigDecimal paymentAmount = bill.getPaymentAmount();
			if (paymentAmount == null || paymentAmount.compareTo(BigDecimal.ZERO) <= 0) {
				paymentAmount = BigDecimal.ZERO;
			}
			bill.setBalance(paymentAmount.subtract(bill.getTotalPrice()));
		}
		billService.saveBills(bills);
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}

}
