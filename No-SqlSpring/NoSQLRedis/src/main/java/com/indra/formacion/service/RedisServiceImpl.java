package com.indra.formacion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements MessageListener{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisServiceImpl.class);
	@Override
	public void onMessage(Message message, byte[] pattern) {
		// TODO Auto-generated method stub
		LOGGER.info("Recibido" + message.toString() + " from Topic -" + new String(pattern));
	}

}
