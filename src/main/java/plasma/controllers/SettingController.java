package plasma.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import plasma.service.SettingService;

@Controller
@RequiredArgsConstructor
public class SettingController {
    private final SettingService service;
}
