package com.service;

import com.Vo.Department;
import com.Vo.ResponseTemplateVO;
import com.entity.User;
import com.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRep userRep;
    @Autowired
    private RestTemplate restTemplate;

    public User save(User user) {
        return userRep.save(user);
    }

    public ResponseTemplateVO getUser(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRep.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
                        ,Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return  vo;
    }
}
