package com.geonyeong.service;
 
import java.util.List;
 
import com.geonyeong.vo.WineVO;
 
public interface WineService {
    
    public List<WineVO> selectwine() throws Exception;
}
