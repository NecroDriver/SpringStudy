<%--
  Created by IntelliJ IDEA.
  User: mafh
  Date: 2017/7/25 0025
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我不是真正的慕课网</title>
    <link rel="stylesheet" href="/css/main.css" type="text/css"/>
    <script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
</head>
<script>
    $(function () {
        var urlStr = "<%=request.getContextPath()%>/courses/courseJson/<%=request.getParameter("courseId")%>";
        $.ajax({
            method:"GET",
            url:urlStr,
            success:function(data,status,xhr){
                var course = data;
                var path = "<%=request.getContextPath()%>/";
                $(".course-title").html(course.title);
                $(".course_video").attr("src", course.imgPath);
                $("#learningNum").text(course.learningNum);
                $("#duration").text(course.duration);
                $("#levelDesc").text(course.levelDesc);
                $(".course_shortdecription").html(course.descr);

                var chapterList = course.chapterList;
                var chapter;

                for(var i = 0;i<chapterList.length;i++){
                    chapter = chapterList[i];

                    var liObj = $("li",$("#chapterTemplate")).clone();
                    $(".outline_name", liObj).text(chapter.title);
                    $(".outline_descr", liObj).text(chapter.descr);
                    liObj.appendTo("#couList");
                }// ~ end for

            }
        });
    })
</script>
<body>
    <div id="main">
        <div class="newcontainer" id="course_intro">
            <div class="course-title"></div>
            <div class="course_info">
                <div class="course-embed l">
                    <div id="js-course-img" class="img-wrap">
                        <img width="600" height="340" alt="" class="course_video"/>
                    </div>
                    <div id="js-video-wrap" class="video" style="display: none">
                        <div class="video_box" id="js-video"></div>
                    </div>
                </div>
                <div class="course_state">
                    <ul>
                        <li><span>学习人数</span><em id="learningNum"></em></li>
                        <li class="course_hour"><span>课程时长</span><em class="ft-adjust"><span id="duration"></span>秒</em> </li>
                        <li><span>课程难度</span><em id="levelDesc"></em></li>
                    </ul>
                </div>
            </div>
            <div class="course_list">
                <div class="outline">
                    <h3 class="chapter_introduces">课程介绍</h3>
                    <div class="course_shortdecription"></div>

                    <h3 class="chapter_catalog">课程提纲</h3>
                    <ul id="couList">

                    </ul>
                </div>

            </div>
        </div>
    </div>
    <div id="chapterTemplate"  style="display:none">
        <li class="clearfix open"><a href="#">
            <div class="openicon"></div>
            <div class="outline_list l">
                <h5 class="outline_name"></h5>
                <p class="outline_descr"></p>
            </div>
        </a></li>
    </div>
</body>
</html>
