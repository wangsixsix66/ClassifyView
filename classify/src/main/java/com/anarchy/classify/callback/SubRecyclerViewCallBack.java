package com.anarchy.classify.callback;

import java.util.List;

/**
 * <p/>
 * Date: 16/6/1 15:11
 * Author: zhendong.wu@shoufuyou.com
 * <p/>
 */
public interface SubRecyclerViewCallBack extends BaseCallBack{
    /**
     * 准备展开副层级
     * @param parentPosition 主层级点击的位置
     */
    void prepareExplodeItem(int parentPosition);
    /**
     * 下面进行数据初始化 和 显示
     * @param data
     * @deprecated {@link #prepareExplodeItem(int)}
     */
    void initData(int parentIndex,List data);


    boolean onMove(int selectedPosition,int targetPosition);
    void moved(int selectedPosition,int targetPosition);

    /**
     * 是否支持移出次级目录
     * @param selectedPosition
     * @return
     */
    boolean canDragOut(int selectedPosition);

}