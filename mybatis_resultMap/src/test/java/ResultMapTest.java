import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp userById = mapper.getUserById(2);
        System.out.println(userById);

    }

    @Test
    public void testgetEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp userById = mapper.getEmpAndDeptByEmpId(2);
        System.out.println(userById);

    }



    @Test
    public void testgetEmpAndDeptByStepOne(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStepOne = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(empAndDeptByStepOne);


    }

    @Test
    public void testgetEmpAndDeptByStepOne1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStepOne = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(empAndDeptByStepOne.getEmpName());
        //懒加载，不执行第二个查询语句


    }


    //获取一个部门中的员工
    @Test
    public void testgetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept empAndDeptByStepOne = mapper.getDeptAndEmp(2);
        System.out.println(empAndDeptByStepOne);
        //懒加载，不执行第二个查询语句


    }


    //获取一个部门中的员工
    @Test
    public void testgetDeptAndEmpByStepOne(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept empAndDeptByStepOne = mapper.getDeptAndEmpByStepOne(2);
        System.out.println(empAndDeptByStepOne);
        //懒加载，不执行第二个查询语句


    }
}
