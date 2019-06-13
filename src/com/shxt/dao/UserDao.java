package com.shxt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.shxt.model.User;

public interface UserDao {
	User load(Integer user_id);
}
