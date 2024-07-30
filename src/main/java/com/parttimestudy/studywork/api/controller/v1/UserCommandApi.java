package com.parttimestudy.studywork.api.controller.v1;

import com.parttimestudy.studywork.api.controller.v1.request.UserRegistrationRequestDTO;
import com.parttimestudy.studywork.api.support.response.ApiResponse;
import com.parttimestudy.studywork.application.facade.UserFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserCommandApi {
    private final UserFacade userFacade;

    public UserCommandApi(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping("/users")
    public ApiResponse<HttpStatus> addNewUser(@RequestBody UserRegistrationRequestDTO request) {
        userFacade.registerUser(request.toUserRegistrationRequestData());
        return ApiResponse.success(HttpStatus.CREATED);
    }
}
