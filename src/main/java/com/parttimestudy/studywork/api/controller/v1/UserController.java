package com.parttimestudy.studywork.api.controller.v1;

import com.parttimestudy.studywork.api.controller.v1.request.UserRegistrationRequestDTO;
import com.parttimestudy.studywork.api.controller.v1.response.ExampleResponseDto;
import com.parttimestudy.studywork.api.domain.ExampleData;
import com.parttimestudy.studywork.api.domain.ExampleResult;
import com.parttimestudy.studywork.api.domain.ExampleService;
import com.parttimestudy.studywork.api.domain.user.UserRegistrationResult;
import com.parttimestudy.studywork.api.domain.user.UserService;
import com.parttimestudy.studywork.api.support.response.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {
    private final ExampleService exampleService;
    private final UserService userService;

    public UserController(ExampleService exampleService, UserService userService) {
        this.exampleService = exampleService;
        this.userService = userService;
    }

    @GetMapping("/get/{exampleValue}")
    public ApiResponse<ExampleResponseDto> exampleGet(@PathVariable String exampleValue,
                                                      @RequestParam String exampleParam) {
        ExampleResult result = exampleService.processExample(new ExampleData(exampleValue, exampleParam));
        return ApiResponse.success(new ExampleResponseDto(result.data()));
    }

    @PostMapping("/add")
    public ApiResponse<ExampleResponseDto> addNewUser(@RequestBody UserRegistrationRequestDTO request) {
        UserRegistrationResult result = userService.addNewUser(request.toUserData());
        return ApiResponse.success(new ExampleResponseDto(result.name()));
    }
}
