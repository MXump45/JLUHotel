layui.use('table', function() {
    $ = layui.jquery
    var table = layui.table;
    var laydate = layui.laydate;
    var btn = $("#query");
    var begin = $("#begin");
    var end = $("#end");

    var user = localStorage.getItem('user')
    var nav1 = document.getElementById("nav1");
    var nav2 = document.getElementById("nav2");
    if(localStorage.getItem('user')==null){//未登录
        var a1 = document.createElement('a');
        a1.setAttribute("href","login.html");
        a1.setAttribute("class","layui-icon layui-icon-username");
        a1.innerText="登录"
        nav1.appendChild(a1);

        var a2 = document.createElement('a');
        a2.setAttribute("href","logon.html");
        a2.innerText="注册"
        nav2.appendChild(a2);
    }else{//已登录
        var a1 = document.createElement('a');
        a1.setAttribute("class","layui-icon layui-icon-username");
        a1.innerText=user
        nav1.appendChild(a1);

        var a11 = document.createElement('dl');
        a11.setAttribute("class","layui-nav-child");
        a11.innerHTML='<dd><a href="javascript:;">我的订单</a></dd><dd><a href="javascript:;">个人中心</a></dd>'
        a1.appendChild(a11);

        var a2 = document.createElement('a');
        a2.setAttribute('id','a2');
        a2.innerText="注销"
        nav2.appendChild(a2);

        var a2 = $('#a2')
        a2.on('click',function () { //注销
            localStorage.removeItem('user')
            a1.setAttribute("href","login.html");
            a1.setAttribute("class","layui-icon layui-icon-username");
            var childs = a1.childNodes;
            for (let i = childs.length - 1; i >= 0 ; i--) {
                a1.removeChild(childs[i])
            }
            a1.innerText="登录"

            a2 = a2.get(0);
            a2.setAttribute("href","logon.html");
            a2.innerText="注册"
            return false;
        })
    }

    laydate.render({
        elem: '#start'
        , position: 'abolute'
        , change: function (value, date) { //监听日期被切换
            lay('#start').html(value);
        }
    });

    laydate.render({
        elem: '#end'
        , position: 'abolute'
        , change: function (value, date) { //监听日期被切换
            lay('#end').html(value);
        }
    });

    function getInfo(URL) {
        // $.ajax({
        //     url: URL,
        //     type: "post",
        //     dataType: "json",
        //     data:{},
        //     success: function (data, status) {
        //         var d = data;
        //
        //         // layui.use(['form', 'jquery', 'table', 'layer'], function () {
        //         //     var form = layui.form;
        //         //     var $ = layui.jquery;
        //         //     var table = layui.table;
        //         //     var layer = layui.layer;
        //
        //         table.render({
        //             elem: "#dataTable",
        //             data: d,
        //             cols: [[
        //                 {field: 'id', title: '房型', width: 300}
        //                 , {field: 'username', title: '描述', width: 200}
        //                 , {
        //                     field: 'email', title: '早餐', width: 200, templet: function (res) {
        //                         return '<em>' + res.email + '</em>'
        //                     }
        //                 }
        //                 , {field: 'logins', title: '房价', width: 150}
        //                 , {field: 'logins', title: '', width: 150}
        //                 , {fixed: 'right', title: '', toolbar: '#barDemo', width: 150}
        //             ]]
        //             , page: true
        //             , skin: 'line'
        //             , response: {
        //                 statusCode: 200 //重新规定成功的状态码为 200，table 组件默认为 0
        //             }
        //             , parseData: function (res) { //将原始数据解析成 table 组件所规定的数据
        //                 return {
        //                     "code": res.status, //解析接口状态
        //                     "msg": res.message, //解析提示文本
        //                     "count": res.total, //解析数据长度
        //                     "data": res.rows.item //解析数据列表
        //                 };
        //             }
        //         });
        //         // });
        //     }
        // });

        table.render({
            elem: '#test'
            ,url: URL
            ,cols: [[
                {field:'id', title:'房型', width:300}
                ,{field:'username', title:'描述', width:200}
                ,{field:'email', title:'早餐', width:200, templet: function(res){
                        return '<em>'+ res.email +'</em>'
                    }}
                ,{field:'logins', title:'房价', width:150}
                ,{field:'logins', title:'', width:150}
                ,{fixed: 'right', title:'', toolbar: '#barDemo', width:150}
            ]]
            ,page: true
            ,skin: 'line'
            ,response: {
                statusCode: 200 //重新规定成功的状态码为 200，table 组件默认为 0
            }
            ,parseData: function(res){ //将原始数据解析成 table 组件所规定的数据
                return {
                    "code": res.status, //解析接口状态
                    "msg": res.message, //解析提示文本
                    "count": res.total, //解析数据长度
                    "data": res.rows.item //解析数据列表
                };
            }
        });
    }

    getInfo('demo3.json');

    btn.on('click',function () {
        if(begin.val() < end.val()){
            alert(begin.val() + '——' + end.val())
            getInfo('demo3.json');
        }else{
            layer.msg('时间输入有误，请保证离店时间晚于入住时间');
        }
    })

    //监听工具条
    table.on('tool(test)', function(obj){
        var data = obj.data;
        if(obj.event === 'edit'){
            layer.alert('编辑行：<br>'+ JSON.stringify(data))

        }
    });
});


//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
    var element = layui.element;

    //…
});