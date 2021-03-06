package com.hiriver.unbiz.mysql.lib.output;

import com.hiriver.unbiz.mysql.lib.ColumnType;
import com.hiriver.unbiz.mysql.lib.MyCharset;

/**
 * 表字段描述
 * 
 * @author hexiufeng
 *
 */
public class ColumnDefinition {
    /**
     * 字段名称
     */
    private String columName;
    /**
     * 字段类型
     */
    private ColumnType type;
    /**
     * 字段的字符集
     */
    private MyCharset charset;
    /**
     * 是否是无符号
     */
    private boolean isUnsigned;
    /**
     * 是否是主键
     */
    private boolean isPrimary;
    /**
     * 是否在unique key字段
     */
    private boolean isUnique;
    /**
     * 是否索引字段
     */
    private boolean isKey;
    
    private int len;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getColumName() {
        return columName;
    }

    public ColumnType getType() {
        return type;
    }

    public void setColumName(String columName) {
        this.columName = columName;
    }

    public void setType(ColumnType type) {
        this.type = type;
    }

    public MyCharset getCharset() {
        return charset;
    }

    public void setCharset(MyCharset charset) {
        this.charset = charset;
    }

    public boolean isUnsigned() {
        return isUnsigned;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public boolean isUnique() {
        return isUnique;
    }

    public boolean isKey() {
        return isKey;
    }

    public void setUnsigned(boolean isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    public void setPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public void setUnique(boolean isUnique) {
        this.isUnique = isUnique;
    }

    public void setKey(boolean isKey) {
        this.isKey = isKey;
    }

}
