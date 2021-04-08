package com.lisong.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lisong
 * @create 2021-04-07 21:42
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    public Long getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getDb_source() {
        return db_source;
    }

    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}
