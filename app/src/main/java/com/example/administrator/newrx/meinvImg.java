package com.example.administrator.newrx;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

public class meinvImg {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"total":952,"ret_code":0,"ret_message":"Success","data":[{"id":13707,"title":"[月光影像]《那个年代第一季》","ctime":0,"imgcount":13,"imgurl":"http://images.seqier.com/2017032918/58db8a05ef1fc.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13705,"title":"【STRONG VISON]Smile girl","ctime":0,"imgcount":6,"imgurl":"http://images.seqier.com/2017032918/58db89ebb0729.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13699,"title":"［月光影像］《极度心情》酒吧人像作品","ctime":0,"imgcount":12,"imgurl":"http://images.seqier.com/2017032918/58db899962547.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13697,"title":"初夏即妖娆","ctime":0,"imgcount":7,"imgurl":"http://images.seqier.com/2017032918/58db897cac794.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13695,"title":"【强强人像】拿什么忘记你","ctime":0,"imgcount":7,"imgurl":"http://images.seqier.com/2017032918/58db8962b195a.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13693,"title":"徜徉在达里湖畔","ctime":0,"imgcount":6,"imgurl":"http://images.seqier.com/2017032918/58db893e83b0f.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13659,"title":"09\u20180321朝阳外拍----潘蓉美眉","ctime":0,"imgcount":22,"imgurl":"http://images.seqier.com/2017032918/58db87e96d329.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13658,"title":"雨宣mm(购机周年纪念)","ctime":0,"imgcount":5,"imgurl":"http://images.seqier.com/2017032918/58db87d624384.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13655,"title":"【强强人像】秋天的恋歌","ctime":0,"imgcount":8,"imgurl":"http://images.seqier.com/2017032918/58db87abf0c0f.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13653,"title":"...............................天际.................","ctime":0,"imgcount":16,"imgurl":"http://images.seqier.com/2017032918/58db878d6082f.jpg?imageView2/2/w/240/q/75|imageslim"}]}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * total : 952
         * ret_code : 0
         * ret_message : Success
         * data : [{"id":13707,"title":"[月光影像]《那个年代第一季》","ctime":0,"imgcount":13,"imgurl":"http://images.seqier.com/2017032918/58db8a05ef1fc.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13705,"title":"【STRONG VISON]Smile girl","ctime":0,"imgcount":6,"imgurl":"http://images.seqier.com/2017032918/58db89ebb0729.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13699,"title":"［月光影像］《极度心情》酒吧人像作品","ctime":0,"imgcount":12,"imgurl":"http://images.seqier.com/2017032918/58db899962547.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13697,"title":"初夏即妖娆","ctime":0,"imgcount":7,"imgurl":"http://images.seqier.com/2017032918/58db897cac794.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13695,"title":"【强强人像】拿什么忘记你","ctime":0,"imgcount":7,"imgurl":"http://images.seqier.com/2017032918/58db8962b195a.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13693,"title":"徜徉在达里湖畔","ctime":0,"imgcount":6,"imgurl":"http://images.seqier.com/2017032918/58db893e83b0f.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13659,"title":"09\u20180321朝阳外拍----潘蓉美眉","ctime":0,"imgcount":22,"imgurl":"http://images.seqier.com/2017032918/58db87e96d329.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13658,"title":"雨宣mm(购机周年纪念)","ctime":0,"imgcount":5,"imgurl":"http://images.seqier.com/2017032918/58db87d624384.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13655,"title":"【强强人像】秋天的恋歌","ctime":0,"imgcount":8,"imgurl":"http://images.seqier.com/2017032918/58db87abf0c0f.jpg?imageView2/2/w/240/q/75|imageslim"},{"id":13653,"title":"...............................天际.................","ctime":0,"imgcount":16,"imgurl":"http://images.seqier.com/2017032918/58db878d6082f.jpg?imageView2/2/w/240/q/75|imageslim"}]
         */

        private int total;
        private int ret_code;
        private String ret_message;
        private List<DataBean> data;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public String getRet_message() {
            return ret_message;
        }

        public void setRet_message(String ret_message) {
            this.ret_message = ret_message;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 13707
             * title : [月光影像]《那个年代第一季》
             * ctime : 0
             * imgcount : 13
             * imgurl : http://images.seqier.com/2017032918/58db8a05ef1fc.jpg?imageView2/2/w/240/q/75|imageslim
             */

            private int id;
            private String title;
            private int ctime;
            private int imgcount;
            private String imgurl;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public int getImgcount() {
                return imgcount;
            }

            public void setImgcount(int imgcount) {
                this.imgcount = imgcount;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }
        }
    }
}
