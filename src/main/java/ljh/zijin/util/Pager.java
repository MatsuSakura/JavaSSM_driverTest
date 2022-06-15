package ljh.zijin.util;

import java.util.List;

public class Pager<T> {
    private Integer pageNo;
    private Integer pageCount; //找出总页数
    private List<T> datas; //找出此页的数据

    public Integer getPageNo() {
        return pageNo;
    }

    //通过这个方法设置的pageNo一定是正确的
    //因为需要判断，所以一定要设置总页数，再设置当前页码
    public void setPageNo(Integer pageNo) {
        //用户直接给的页码不一定是对的
        //需要进行判断
        if(pageNo > pageCount){ //需求的页数是否大于总页数
            pageNo = pageCount; //如果是的话，调整到最后一页
        }
        if(pageNo < 1){ //需求的页数是否小于有效范围
            pageNo = 1; //如果是的话，调整到第一页
        }
        this.pageNo = pageNo;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    //为总页数的设置提供重载的方法
    //可以同时通过总条数和每页显示的行数计算总页数
    public void setPageCount(Integer totalCount,
                             Integer pageSize){
        //先除一次，算出整的页
        pageCount = totalCount / pageSize;
        //再问是否存在不满一页的数据
        if(totalCount % pageSize != 0){
            pageCount++; //如果有的话，总页数 + 1，用来放这些数据
        }
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
