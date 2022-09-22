package com.red.common;

import com.red.dto.UserDTO;

public class ThreadLocals {
    private static final ThreadLocal<UserDTO> USER_ID = new ThreadLocal<>();

    public static UserDTO getUser() {
        return USER_ID.get();
    }

    public static void setUser(UserDTO userDTO) {
        USER_ID.set(userDTO);
    }

    public static void removeUser() {
        USER_ID.remove();
    }

}
