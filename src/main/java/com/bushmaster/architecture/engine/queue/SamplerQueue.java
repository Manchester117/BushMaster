package com.bushmaster.architecture.engine.queue;

import com.bushmaster.architecture.domain.entity.SampleResultInfo;

import java.util.concurrent.LinkedBlockingQueue;

public class SamplerQueue {
    // 定义队列长度
    public static final int QUEUE_MAX_SIZE = 10000;
    private static SamplerQueue samplerQueue = new SamplerQueue();

    // 定义阻塞队列
    private LinkedBlockingQueue<SampleResultInfo> queue = new LinkedBlockingQueue<>(QUEUE_MAX_SIZE);

    private SamplerQueue() {}

    public static SamplerQueue getInstance() {
        return samplerQueue;
    }

    /**
     * @description         获得当前队列的长度
     * @return              当前队列长度
     */
    public int getQueueCurrentSize() {
        return queue.size();
    }

    /**
     * @description         消息入列
     * @param sampleResultInfo   Sampler实体
     * @return              返回是否添加的boolean值
     */
    public boolean push(SampleResultInfo sampleResultInfo) {
        return this.queue.add(sampleResultInfo);
    }

    /**
     * @description         消息出列
     * @return              返回Sampler实体
     */
    public SampleResultInfo pop() {
        SampleResultInfo sampleResultInfo = null;
        try {
            sampleResultInfo = this.queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sampleResultInfo;
    }
}
