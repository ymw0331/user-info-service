package com.wayneyong.userinfo.mapper;

import com.wayneyong.userinfo.entity.User;
import com.wayneyong.userinfo.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);
}
