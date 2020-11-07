package com.behl.app.ws.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.behl.app.ws.exceptions.UserServiceException;
import com.behl.app.ws.io.entity.UserEntity;
import com.behl.app.ws.io.repositories.UserRepository;
import com.behl.app.ws.service.UserService;
import com.behl.app.ws.shared.Utils;
import com.behl.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

//	private static final String UserEntity = null;

	@Autowired
	UserRepository userRepository;

	@Autowired
	Utils utils;

//	@Autowired
//	BCryptPasswordEncoder bCryptPasswordEncoder;

	
	public UserDto createUser(UserDto user) {
//		if (userRepository.findByEmail(user.getEmail()) != null)
//			throw new UserServiceException("Record already exists.");
		
		UserEntity userEntity = new UserEntity();
		ModelMapper modelMapper = new ModelMapper();
		userEntity = modelMapper.map(user, UserEntity.class);

		String publicUserId = utils.generateUserId(30);		
		userEntity.setUserId(publicUserId);
		userEntity.setEncryptedPassword("test");
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		returnValue = modelMapper.map(storedUserDetails, UserDto.class);
		
		return returnValue;

	}

	@Override
	public UserDto getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(String userId, UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserDto> getUsers(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
