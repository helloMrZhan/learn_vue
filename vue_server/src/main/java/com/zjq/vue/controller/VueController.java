package com.zjq.vue.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjq.vue.utils.ControllerHelper;
import com.zjq.vue.utils.ResponseVO;
import com.zjq.vue.vo.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * @author zjq
 * @date 2020/6/10 19:26
 * <p>title:vue后台</p>
 * <p>description:</p>
 */
@RestController
@RequestMapping(value = "/user")
public class VueController {

        public static List<User> userList = new ArrayList(){
                {
                        for (int i=0;i<3;i++){
                                User user = new User();
                                user.setId(i);
                                user.setAge(i+15);
                                user.setName("张三"+i);
                                user.setAddress("黄山"+i);
                                user.setDate(LocalDate.now());
                                add(user);
                        }
                }
        };
        @GetMapping("/getUser")
        public ResponseVO getUser(Integer id){
                User u = null;
                for (User user:userList){
                        if(user.getId().equals(id)){
                                u = user;
                        }
                }
                return ControllerHelper.success(u);
        }

        @GetMapping("/getUserList")
        public ResponseVO getUserList(){
                return ControllerHelper.success(userList);
        }

        @PostMapping("/addUser")
        public ResponseVO addUser(HttpServletRequest request){
                User user = new User();
                Integer i = userList.size()+1;
                user.setId(i);
                user.setName(request.getParameter("name")==null?"zjq":request.getParameter("name"));
                user.setAge(request.getParameter("age")==null||request.getParameter("age").equals("undefined")?(20+i):Integer.valueOf(request.getParameter("age")));
                user.setAddress(request.getParameter("address")==null?("杭州"+i):request.getParameter("address"));
                user.setDate(LocalDate.now());
                userList.add(user);
                return ControllerHelper.success("新增成功");
        }

        @GetMapping("/delUser")
        public ResponseVO delUser(Integer id){
                Iterator<User> iterator = userList.iterator();
                while (iterator.hasNext()){
                        User user = iterator.next();
                        if(user.getId().equals(id)){
                                iterator.remove();
                        }
                }
                return ControllerHelper.success("刪除成功");
        }
}
