package com.example.waterflowdemo;

import java.util.List;

/**
 * Created by 教科书式的机智少年 on 2016/10/28.
 */

public class DressBean {
    /**
     * error : false
     * results : [{"_id":"581218e9421aa90e799ec222","createdAt":"2016-10-27T23:10:33.618Z","desc":"10-28","publishedAt":"2016-10-28T11:29:36.510Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f978bh1cerj20u00u0767.jpg","used":true,"who":"daimajia"},{"_id":"5811596a421aa90e6f21b45e","createdAt":"2016-10-27T09:33:30.47Z","desc":"10-27","publishedAt":"2016-10-27T11:41:45.88Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034gw1f96kp6faayj20u00jywg9.jpg","used":true,"who":"daimajia"},{"_id":"58101f83421aa90e6f21b44b","createdAt":"2016-10-26T11:14:11.143Z","desc":"10-26","publishedAt":"2016-10-26T11:28:10.759Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f95hzq3p4rj20u011htbm.jpg","used":true,"who":"daimajia"},{"_id":"580e9c74421aa90e799ec1fa","createdAt":"2016-10-25T07:42:44.254Z","desc":"10-25","publishedAt":"2016-10-25T11:35:01.586Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f9469eoojtj20u011hdjy.jpg","used":true,"who":"daimajia"},{"_id":"580c1794421aa90e6f21b431","createdAt":"2016-10-23T09:51:16.503Z","desc":"10-24","publishedAt":"2016-10-24T11:25:22.197Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f91ypzqaivj20u00k0jui.jpg","used":true,"who":"daimajia"},{"_id":"5809639e421aa90e799ec1de","createdAt":"2016-10-21T08:38:54.539Z","desc":"10-21","publishedAt":"2016-10-21T11:42:18.625Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f8zlenaornj20u011idhv.jpg","used":true,"who":"daimajia"},{"_id":"58078baf421aa91369f9594c","createdAt":"2016-10-19T23:05:19.787Z","desc":"10-20","publishedAt":"2016-10-20T11:39:59.546Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f8xz7ip2u5j20u011h78h.jpg","used":true,"who":"daimajia"},{"_id":"5806eb37421aa90e799ec1c4","createdAt":"2016-10-19T11:40:39.218Z","desc":"10-19","publishedAt":"2016-10-19T11:47:24.946Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f8xff48zauj20u00x5jws.jpg","used":true,"who":"daimajia"},{"_id":"5805612d421aa90e799ec1ac","createdAt":"2016-10-18T07:39:25.756Z","desc":"10-18","publishedAt":"2016-10-18T11:50:35.205Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f8w2tr9bgzj20ku0mjdi8.jpg","used":true,"who":"代码家"},{"_id":"580412cc421aa90e6f21b3da","createdAt":"2016-10-17T07:52:44.2Z","desc":"10-17","publishedAt":"2016-10-17T11:32:00.914Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f8uxlbptw7j20ku0q1did.jpg","used":true,"who":"daimajia"}]
     */

    private boolean error;
    /**
     * _id : 581218e9421aa90e799ec222
     * createdAt : 2016-10-27T23:10:33.618Z
     * desc : 10-28
     * publishedAt : 2016-10-28T11:29:36.510Z
     * source : chrome
     * type : 福利
     * url : http://ww2.sinaimg.cn/large/610dc034jw1f978bh1cerj20u00u0767.jpg
     * used : true
     * who : daimajia
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
