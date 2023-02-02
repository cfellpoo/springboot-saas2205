<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor: pointer;
        }

        table tbody tr:nth-child(odd) {
            background: #F4F4F4;
        }

        table tbody td:nth-child(even) {
            color: #C00;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="#">乐柠教育</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li style="padding-top:8px;">
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-success dropdown-toggle"
                                data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i> ${loginuser.username } <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
                            <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                            <li class="divider"></li>
                            <li><a href="index.html"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                        </ul>
                    </div>
                </li>
                <li style="margin-left:10px;padding-top:8px;">
                    <button type="button" class="btn btn-default btn-danger">
                        <span class="glyphicon glyphicon-question-sign"></span> 帮助
                    </button>
                </li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <div class="tree">
                <ul style="padding-left:0px;" class="list-group">
                    <li class="list-group-item tree-closed">
                        <a href="main.html"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a>
                    </li>
                    <li class="list-group-item">
                        <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 权限管理 <span class="badge"
                                                                                             style="float:right">3</span></span>
                        <ul style="margin-top:10px;">
                            <li style="height:30px;">
                                <a href="/userController/toindex_page" style="color:red;"><i class="glyphicon glyphicon-user"></i> 用户维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="/rc/toindex_page"><i用户维护 class="glyphicon glyphicon-king"></i用户维护> 角色维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="permission.html"><i class="glyphicon glyphicon-lock"></i> 许可维护</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-ok"></i> 业务审核 <span class="badge"
                                                                                style="float:right">3</span></span>
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="auth_cert.html"><i class="glyphicon glyphicon-check"></i> 实名认证审核</a>
                            </li>
                            <li style="height:30px;">
                                <a href="auth_adv.html"><i class="glyphicon glyphicon-check"></i> 广告审核</a>
                            </li>
                            <li style="height:30px;">
                                <a href="auth_project.html"><i class="glyphicon glyphicon-check"></i> 项目审核</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-th-large"></i> 业务管理 <span class="badge" style="float:right">7</span></span>
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="cert.html"><i class="glyphicon glyphicon-picture"></i> 资质维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="type.html"><i class="glyphicon glyphicon-equalizer"></i> 分类管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="process.html"><i class="glyphicon glyphicon-random"></i> 流程管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="advertisement.html"><i class="glyphicon glyphicon-hdd"></i> 广告管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="message.html"><i class="glyphicon glyphicon-comment"></i> 消息模板</a>
                            </li>
                            <li style="height:30px;">
                                <a href="project_type.html"><i class="glyphicon glyphicon-list"></i> 项目分类</a>
                            </li>
                            <li style="height:30px;">
                                <a href="tag.html"><i class="glyphicon glyphicon-tags"></i> 项目标签</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <a href="param.html"><i class="glyphicon glyphicon-list-alt"></i> 参数管理</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input id="nameText" value="${likeName}" class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" onclick="nameTexts()" class="btn btn-warning"><i
                                class="glyphicon glyphicon-search"></i> 查询
                        </button>
                    </form>
                    <button type="button" onclick="sub_delsuser()" class="btn btn-danger"
                            style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除
                    </button>
                    <button type="button" class="btn btn-primary" style="float:right;"
                            onclick="window.location.href='/userController/toadd'"><i class="glyphicon glyphicon-plus"></i> 新增
                    </button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <form id="delsuser">
                            <table class="table  table-bordered">
                                <thead>
                                <tr>
                                    <th width="30">#</th>
                                    <th width="30"><input id="ckid" type="checkbox"></th>
                                    <th>账号</th>
                                    <th>名称</th>
                                    <th>邮箱地址</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${list }" var="list" varStatus="status">
                                <tr>
                                    <td>${status.count }</td>
                                    <td><input name="id" value="${list.id }" type="checkbox"></td>
                                    <td>${list.loginacct }</td>
                                    <td>${list.username }</td>
                                    <td>${list.email }</td>
                                    <td>
                                        <button type="button" onclick="asignUser(${list.id})"
                                                class="btn btn-success btn-xs"><i
                                                class=" glyphicon glyphicon-check"></i></button>
                                        <button type="button" onclick="up1('${list.id }')"
                                                class="btn btn-primary btn-xs"><i
                                                class=" glyphicon glyphicon-pencil"></i></button>
                                        <button type="button" onclick="delUser('${list.id}')"
                                                class="btn btn-danger btn-xs"><i
                                                class=" glyphicon glyphicon-remove"></i></button>
                                    </td>
                                    </c:forEach>


                                </tr>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="6" align="center">
                                        <ul class="pagination">
                                            <c:if test="${pageno>1 }">
                                                <li class="disabled"><a href="#"
                                                                        onclick="changepageno(${pageno-1})">上一页</a></li>
                                            </c:if>
                                            <c:forEach begin="1" end="${totalno }" varStatus="status">

                                                <c:if test="${pageno==status.count  }">
                                                    <li class="active"><a href="#">${status.count }</a></li>
                                                </c:if>
                                                <c:if test="${pageno!=status.count  }">
                                                    <li><a hre f="#"
                                                           onclick="changepageno(${status.count })">${status.count }</a>
                                                    </li>
                                                </c:if>
                                            </c:forEach>
                                            <c:if test="${pageno<totalno }">
                                                <li><a href="#" onclick="changepageno(${pageno+1})">下一页</a></li>
                                            </c:if>
                                        </ul>
                                    </td>
                                </tr>

                                </tfoot>

                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../jquery/common.js"></script>
<script src="../jquery/jquery-2.1.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../script/docs.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".list-group-item").click(function () {
            if ($(this).find("ul")) {
                $(this).toggleClass("tree-closed");
                if ($(this).hasClass("tree-closed")) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });
    });

    /*$("tbody .btn-primary").click(function(){
        window.location.href = "edit.html";
    });*/
    function changepageno(pageno) {
        var username = $("#nameText").val();
        window.location.href = "/userController/toindex_page?startPage=" + pageno+"&likeName_respon="+username;
    }

    function nameTexts() {
        var username = $("#nameText").val();
        window.location.href = "/userController/toindex_page?likeName_respon=" + username;
    }

    //删除
    function delUser(id) {
        $.ajax({
            type: "post",
            url: "/userController/delUserById",
            data: {
                id: id
            },
            dataType: 'text',
            success: function (result) {
                if (result == 'ok') {
                    alert("删除成功")
                    window.location.reload(true);
                } else {
                    alert("删除失败")
                }
            }
        });
    }

    //
    $("#ckid").click(function () {
        var flag = this.checked;
        alert(flag);
        $("input:checkbox").each(function () {
            this.checked = flag;
        })
    })

    function sub_delsuser() {
        var ids = "";
        var flag = $(":checkbox:checked");
        for (var i = 0; i < flag.length; i++) {
            ids += flag[i].value + ",";
        }
        ids = ids.substring(0, ids.length - 1)
        $.ajax({
            type: "post",
            url:"/userController/deluserss",
            data: {
                ids: ids
            },
            dataType: 'text',
            success: function (result) {
                if (result == 'ok') {
                    alert("批量删除成功")
                    window.location.reload(true);
                } else {
                    alert("批量删除失败")
                }
            }
        });
        /* var flag=$("input:checkbox");
        if(flag.length==0){
            alert("请选择要删除信息");
        }else{
            $.ajax({
                 type:"post",
                 url:baseUrl+"/uc/deluserss",
                 data:$("#delsuser").serialize(),
                 dataType:'text',
                 success:function(result){
                     if(result=='ok'){
                         alert("批量删除成功")
                          window.location.reload(true);
                     }else{
                         alert("批量删除失败")
                     }
                 }
             });
        } */
    }

    function asignUser(id) {
        window.location.href = "/uc/asignUser?id=" + id;
    }

    function up1(id) {
        alert(id)
        window.location.href = "/userController/toEdit?id=" + id
    }
</script>
</body>
</html>
