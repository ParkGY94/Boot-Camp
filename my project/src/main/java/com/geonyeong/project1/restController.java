package com.geonyeong.project1;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.geonyeong.vo.WineVO;
import com.geonyeong.service.WineService;

@RestController
public class restController {
    
    private static final Logger logger = LoggerFactory.getLogger(restController.class);
    
    @Inject
    private WineService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/restex")
    public List<WineVO> wineList() throws Exception{
 
        logger.info("home");
        
        List<WineVO> wineList = service.selectwine();
        
        //model.addAttribute("wineList", wineList);
 
        return wineList;
    }
    
}
