/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.pushnotifications.sender.sms;

import com.liferay.pushnotifications.sender.BaseResponse;

import com.twilio.sdk.resource.instance.Sms;

/**
 * @author Bruno Farache
 */
public class TwilioResponse extends BaseResponse {

	public TwilioResponse(Sms sms) {
		accountSid = sms.getAccountSid();
		id = sms.getSid();
		price = sms.getPrice();
		status = sms.getStatus();
		token = sms.getTo();
	}

	public String getAccountSid() {
		return accountSid;
	}

	public String getPrice() {
		return price;
	}

	protected String accountSid;
	protected String price;

}