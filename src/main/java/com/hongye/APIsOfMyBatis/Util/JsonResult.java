package com.hongye.APIsOfMyBatis.Util;

/**
 * The type Json result
 * @author 竑也
 */
public class JsonResult {

    /**
     * The Success.
     */
    public boolean success;

    /**
     * The Message.
     */
    public String message;

    /**
     * The Code.
     */
    public String code;

    /**
     * The Items.
     */
    public  Object items;

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(Object items) {
        this.items = items;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public Object getItems() {
        return items;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     * @param object  the object
     */
    public JsonResult (boolean success,String code,Object object){
        this(success,code);
        this.items=object;
        this.message= com.hongye.APIsOfMyBatis.Util.ReturnCodeUtil.getMsg(code);
    }

    /**
     * Instantiates a new Json result.
     */
    public JsonResult(){}

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     */
    public JsonResult(boolean success,String code){
        this(success);
        this.code=code;
        this.message= com.hongye.APIsOfMyBatis.Util.ReturnCodeUtil.getMsg(code);
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     */
    public JsonResult (boolean success){
        this.success=success;
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     * @param message the message
     */
    public JsonResult(boolean success,String code,String message){
        this(success);
        this.code=code;
        this.message=message;
    }
}
