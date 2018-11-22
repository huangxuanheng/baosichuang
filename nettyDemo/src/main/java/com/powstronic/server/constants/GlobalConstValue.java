package com.powstronic.server.constants;

/**
 * 服务器常量定义
 * @author harry
 *
 */
public interface GlobalConstValue {

	/**
     * 帧头的长度
     **/
    int FRM_HEAD_LENGTH = 1;
    
    /**
     * 设备id的长度
     */
    int FRM_DEVICE_ID_LENGTH = 2;
    
    /**
     * 包的长度，具体要根据协议来定，有些是所有帧头帧尾等长度相加，有些只有数据长度
     */
    int FRM_DATA_LENGTH = 2;
    
    /**
     * 命令的长度，功能码长度
     **/
    int FRM_CMD_LENGTH = 1;
    
    /**
     * 帧尾的长度
     */
    int FRM_TAIL_LENGTH = 1;
    
    /**
     * 校验和的长度
     */
    int FRM_CHECK_SUM_LENGTH = 2;
    
    /**
     * 包的基本长度
     */
    int FRM_BASE_LENGTH=FRM_HEAD_LENGTH+FRM_DEVICE_ID_LENGTH+FRM_DATA_LENGTH+FRM_CMD_LENGTH+FRM_TAIL_LENGTH+FRM_CHECK_SUM_LENGTH;
}
