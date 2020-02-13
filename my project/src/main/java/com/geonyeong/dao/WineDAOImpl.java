package com.geonyeong.dao;

import java.util.List;

import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.geonyeong.vo.WineVO;
 
@Repository
public class WineDAOImpl implements WineDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.geonyeong.mybatis.sql.test";
    
    @Override
    public List<WineVO> selectwine() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectwine");
    }
 
}
