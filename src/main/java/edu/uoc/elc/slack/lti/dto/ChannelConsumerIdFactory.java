/*
 *     Slack LTI Commands - Classes to provide LTI consumer options to Slack
 *     Copyright (c) 2017  $author
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation; either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *     Contact: xaracil@uoc.edu
 *
 *
 */

package edu.uoc.elc.slack.lti.dto;

import edu.uoc.elc.slack.lti.entity.ChannelConsumerId;
import edu.uoc.elc.slack.lti.type.LaunchCommandRequest;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
public class ChannelConsumerIdFactory {
	public ChannelConsumerId newChannelConsumerId(LaunchCommandRequest request) {
		ChannelConsumerId channelConsumerId = new ChannelConsumerId();
		
		channelConsumerId.setAlias(request.getAlias());
		channelConsumerId.setChannelId(request.getRequest().getChannel_id());

		return channelConsumerId;
	}
}
