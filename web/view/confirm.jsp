<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="static java.util.Calendar.DAY_OF_WEEK" %>
<%
    Calendar c = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String currentDate = df.format(c.getTime());

     Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, -1);

    String yeteday = df.format(cal.getTime());

    cal.add(Calendar.DATE, -7);
    String weekday = df.format(cal.getTime());

    cal.add(Calendar.DATE, -30);
    String mount = df.format(cal.getTime());

%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from agileui.com/demo/monarch/demo/admin-template/dropzone-uploader.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 23 Sep 2017 07:43:39 GMT -->
<head>

    <style>
        /* Loading Spinner */
        .spinner{margin:0;width:70px;height:18px;margin:-35px 0 0 -9px;position:absolute;top:50%;left:50%;text-align:center}.spinner > div{width:18px;height:18px;background-color:#333;border-radius:100%;display:inline-block;-webkit-animation:bouncedelay 1.4s infinite ease-in-out;animation:bouncedelay 1.4s infinite ease-in-out;-webkit-animation-fill-mode:both;animation-fill-mode:both}.spinner .bounce1{-webkit-animation-delay:-.32s;animation-delay:-.32s}.spinner .bounce2{-webkit-animation-delay:-.16s;animation-delay:-.16s}@-webkit-keyframes bouncedelay{0%,80%,100%{-webkit-transform:scale(0.0)}40%{-webkit-transform:scale(1.0)}}@keyframes bouncedelay{0%,80%,100%{transform:scale(0.0);-webkit-transform:scale(0.0)}40%{transform:scale(1.0);-webkit-transform:scale(1.0)}}
    </style>


    <meta charset="UTF-8">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <title> Carestream </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Favicons -->

    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/images/icons/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/images/icons/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/images/icons/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/images/icons/apple-touch-icon-57-precomposed.png">
    <link rel="shortcut icon" href="assets/images/icons/favicon.png">



    <link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap.css">


    <!-- HELPERS -->

    <link rel="stylesheet" type="text/css" href="assets/helpers/animate.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/backgrounds.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/boilerplate.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/border-radius.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/grid.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/page-transitions.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/spacing.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/typography.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/utils.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/colors.css">

    <!-- ELEMENTS -->

    <link rel="stylesheet" type="text/css" href="assets/elements/badges.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/buttons.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/content-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/dashboard-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/forms.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/images.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/info-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/invoice.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/loading-indicators.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/menus.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/panel-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/response-messages.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/responsive-tables.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/ribbon.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/social-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/tables.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/tile-box.css">
    <link rel="stylesheet" type="text/css" href="assets/elements/timeline.css">



    <!-- ICONS -->

    <link rel="stylesheet" type="text/css" href="assets/icons/fontawesome/fontawesome.css">
    <link rel="stylesheet" type="text/css" href="assets/icons/linecons/linecons.css">
    <link rel="stylesheet" type="text/css" href="assets/icons/spinnericon/spinnericon.css">


    <!-- WIDGETS -->

    <link rel="stylesheet" type="text/css" href="assets/widgets/accordion-ui/accordion.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/calendar/calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/carousel/carousel.css">

    <link rel="stylesheet" type="text/css" href="assets/widgets/charts/justgage/justgage.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/charts/morris/morris.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/charts/piegage/piegage.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/charts/xcharts/xcharts.css">

    <link rel="stylesheet" type="text/css" href="assets/widgets/chosen/chosen.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/colorpicker/colorpicker.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/datatable/datatable.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/datepicker/datepicker.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/datepicker-ui/datepicker.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/dialog/dialog.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/dropdown/dropdown.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/dropzone/dropzone.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/file-input/fileinput.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/input-switch/inputswitch.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/input-switch/inputswitch-alt.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/ionrangeslider/ionrangeslider.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/jcrop/jcrop.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/jgrowl-notifications/jgrowl.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/loading-bar/loadingbar.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/maps/vector-maps/vectormaps.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/markdown/markdown.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/modal/modal.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/multi-select/multiselect.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/multi-upload/fileupload.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/nestable/nestable.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/noty-notifications/noty.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/popover/popover.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/pretty-photo/prettyphoto.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/progressbar/progressbar.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/range-slider/rangeslider.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/slidebars/slidebars.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/slider-ui/slider.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/summernote-wysiwyg/summernote-wysiwyg.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/tabs-ui/tabs.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/theme-switcher/themeswitcher.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/timepicker/timepicker.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/tocify/tocify.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/tooltip/tooltip.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/touchspin/touchspin.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/uniform/uniform.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/wizard/wizard.css">
    <link rel="stylesheet" type="text/css" href="assets/widgets/xeditable/xeditable.css">

    <!-- SNIPPETS -->

    <link rel="stylesheet" type="text/css" href="assets/snippets/chat.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/files-box.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/login-box.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/notification-box.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/progress-box.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/todo.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/user-profile.css">
    <link rel="stylesheet" type="text/css" href="assets/snippets/mobile-navigation.css">

    <!-- APPLICATIONS -->

    <link rel="stylesheet" type="text/css" href="assets/applications/mailbox.css">

    <!-- Admin theme -->

    <link rel="stylesheet" type="text/css" href="assets/themes/admin/layout.css">
    <link rel="stylesheet" type="text/css" href="assets/themes/admin/color-schemes/default.css">

    <!-- Components theme -->

    <link rel="stylesheet" type="text/css" href="assets/themes/components/default.css">
    <link rel="stylesheet" type="text/css" href="assets/themes/components/border-radius.css">

    <!-- Admin responsive -->

    <link rel="stylesheet" type="text/css" href="assets/helpers/responsive-elements.css">
    <link rel="stylesheet" type="text/css" href="assets/helpers/admin-responsive.css">

    <!-- JS Core -->

    <script type="text/javascript" src="assets/js-core/jquery-core.js"></script>
    <script type="text/javascript" src="assets/js-core/jquery-ui-core.js"></script>
    <script type="text/javascript" src="assets/js-core/jquery-ui-widget.js"></script>
    <script type="text/javascript" src="assets/js-core/jquery-ui-mouse.js"></script>
    <script type="text/javascript" src="assets/js-core/jquery-ui-position.js"></script>
    <!--<script type="text/javascript" src="assets/js-core/transition.js"></script>-->
    <script type="text/javascript" src="assets/js-core/modernizr.js"></script>
    <script type="text/javascript" src="assets/js-core/jquery-cookie.js"></script>





    <script type="text/javascript">
        $(window).load(function(){
            setTimeout(function() {
                $('#loading').fadeOut( 400, "linear" );
            }, 300);
        });
    </script>



</head>


<body>
<div id="sb-site">

    <div id="loading">
        <div class="spinner">
            <div class="bounce1"></div>
            <div class="bounce2"></div>
            <div class="bounce3"></div>
        </div>
    </div>

    <div id="page-wrapper">
        <div id="page-header" class="bg-gradient-9">
            <div id="mobile-navigation">
                <button id="nav-toggle" class="collapsed" data-toggle="collapse" data-target="#page-sidebar"><span></span></button>
                <a href="index-2.html" class="logo-content-small" title="MonarchUI"></a>
            </div>
            <div id="header-logo" class="logo-bg">
                <a href="/Home" class="logo-content-big" title="MonarchUI">
                    CARESTREAM
                    <span>Simple and accurate diagnostic reporting</span>
                </a>
                <a href="/Home" class="logo-content-small" title="MonarchUI">
                    CARESTREAM
                    <span>Simple and accurate diagnostic reporting</span>
                </a>
                <a id="close-sidebar" href="#" title="Close sidebar">
                    <i class="glyph-icon icon-angle-left"></i>
                </a>
            </div>
            <div id="header-nav-left">
                <div class="user-account-btn dropdown">
                    <a href="#" title="My Account" class="user-profile clearfix" data-toggle="dropdown">
                        <img width="28" src="assets/image-resources/people/testimonial2.jpg" alt="Profile image">
                        <span>Displayname</span>
                        <i class="glyph-icon icon-angle-down"></i>
                    </a>
                    <div class="dropdown-menu float-left">
                        <div class="box-sm">
                            <div class="login-box clearfix">
                                <div class="user-img">

                                    <img src="assets/image-resources/people/testimonial2.jpg" alt="">
                                </div>
                                <div class="user-info">
                            <span>
                                Displayname Barnes
                                <i>Administarot</i>
                            </span>
                                    <a href="#" title="Edit profile">Edit profile</a>
                                    <a href="#" title="View notifications">View notifications</a>
                                </div>
                            </div>


                            <div class="pad5A button-pane button-pane-alt text-center">
                                <a href="#" class="btn display-block font-normal btn-danger">
                                    <i class="glyph-icon icon-power-off"></i>
                                    Logout
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- #header-nav-left -->

            <div id="header-nav-right">

                <a href="#" class="hdr-btn" id="fullscreen-btn" title="Fullscreen">
                    <i class="glyph-icon icon-arrows-alt"></i>
                </a>

                <div class="dropdown" id="notifications-btn">
                    <a data-toggle="dropdown" href="#" title="">
                        <span class="small-badge badge-danger"></span>
                        <i class="glyph-icon icon-linecons-megaphone"></i>
                    </a>
                    <div class="dropdown-menu box-md float-right">

                        <div class="popover-title display-block clearfix pad10A">
                            Notifications

                        </div>
                        <div class="scrollable-content scrollable-slim-box">
                            <ul class="no-border notifications-box">
                                <li>
                                    <span class="bg-danger icon-notification glyph-icon icon-bullhorn"></span>
                                    <span class="notification-text">Login Susessce  notification</span>
                                    <div class="notification-time">
                                        a few seconds ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-warning icon-notification glyph-icon icon-users"></span>
                                    <span class="notification-text font-blue">This is a warning notification</span>
                                    <div class="notification-time">
                                        <b>15</b> minutes ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-green icon-notification glyph-icon icon-sitemap"></span>
                                    <span class="notification-text font-green">A success message example.</span>
                                    <div class="notification-time">
                                        <b>2 hours</b> ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-azure icon-notification glyph-icon icon-random"></span>
                                    <span class="notification-text">This is an error notification</span>
                                    <div class="notification-time">
                                        a few seconds ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-warning icon-notification glyph-icon icon-ticket"></span>
                                    <span class="notification-text">This is a warning notification</span>
                                    <div class="notification-time">
                                        <b>15</b> minutes ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-blue icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text font-blue">Alternate notification styling.</span>
                                    <div class="notification-time">
                                        <b>2 hours</b> ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-purple icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text">This is an error notification</span>
                                    <div class="notification-time">
                                        a few seconds ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-warning icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text">This is a warning notification</span>
                                    <div class="notification-time">
                                        <b>15</b> minutes ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-green icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text font-green">A success message example.</span>
                                    <div class="notification-time">
                                        <b>2 hours</b> ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-purple icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text">This is an error notification</span>
                                    <div class="notification-time">
                                        a few seconds ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                                <li>
                                    <span class="bg-warning icon-notification glyph-icon icon-user"></span>
                                    <span class="notification-text">This is a warning notification</span>
                                    <div class="notification-time">
                                        <b>15</b> minutes ago
                                        <span class="glyph-icon icon-clock-o"></span>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div class="pad10A button-pane button-pane-alt text-center">
                            <a href="#" class="btn btn-primary" title="View all notifications">
                                View all notifications
                            </a>
                        </div>
                    </div>
                </div>



                <a class="header-btn" id="logout-btn" href="/Logout" title="Lockscreen page example">
                    <i class="glyph-icon icon-linecons-lock"></i>
                </a>

            </div><!-- #header-nav-right -->

        </div>
        <div id="page-sidebar">
            <div class="scroll-sidebar">


                <ul id="sidebar-menu">

                    <li class="header"><span>ADMINISTRATORS</span></li>
                    <li>
                        <a href="#" title="Elements">
                            <i class="glyph-icon icon-linecons-diamond"></i>
                            <span>General</span>
                        </a>
                        <div class="sidebar-submenu">

                            <ul>
                                <li><a href="#" title=""><span>Type of Server</span></a></li>
                                <li><a href="#" title=""><span>Preferences</span></a></li>

                            </ul>

                        </div><!-- .sidebar-submenu -->
                    </li>
                    <li>
                    <a href="#" title="Widgets">
                        <i class="glyph-icon icon-linecons-diamond"></i>
                        <span>Hospital Name</span>
                    </a>
                        <div class="sidebar-submenu"></div>
                     </li>

                    <li>
                        <a href="#" title="Dashboard boxes">
                            <i class="glyph-icon icon-linecons-lightbulb"></i>
                            <span>Local Viewer SetUp</span>

                        </a>
                        <div class="sidebar-submenu">

                            <ul>
                                <li><a href="#" title=""><span>Patient ID URL</span></a></li>
                                <li><a href="#" title=""><span>Series ID URL</span></a></li>
                                <li><a href="#" title=""><span>User Account</span></a></li>
                            </ul>

                        </div><!-- .sidebar-submenu -->
                    </li>

                    <li>
                        <a href="#" title="Forms UI">
                            <i class="glyph-icon icon-linecons-eye"></i>
                            <span>Web Viewer Setup</span>
                        </a>
                        <div class="sidebar-submenu">

                            <ul>
                                <li><a href="#" title=""><span>Patient ID URL</span></a></li>
                                <li><a href="#" title=""><span>Series ID URL</span></a></li>
                                <li><a href="#" title=""><span>Study ID URL</span></a></li>
                            </ul>

                        </div><!-- .sidebar-submenu -->
                    </li>
                    <li class="header"><span>USER</span></li>
                    <li>
                        <a href="#" title="Advanced tables">
                            <i class="glyph-icon icon-linecons-megaphone"></i>
                            <span>General</span>
                        </a>

                    </li>
                    <li>
                        <a href="#" title="Charts">
                            <i class="glyph-icon icon-linecons-paper-plane"></i>
                            <span>Request For Account</span>
                        </a>

                    </li>
                    <li>
                        <a href="#" title="Maps">
                            <i class="glyph-icon icon-linecons-sound"></i>
                            <span>Report Summary</span>
                        </a>

                    </li>

                    <li class="header"><span>RADIOLOGIST</span></li>
                    <li>
                        <a href="#" title="Pages">
                            <i class="glyph-icon icon-linecons-fire"></i>
                            <span>Report Summary</span>

                        </a>

                    </li>

                </ul><!-- #sidebar-menu -->


            </div>
        </div>
        <div id="page-content-wrapper">
            <div id="page-content">

                <div class="container">
                    <div class="panel">
                        <div class="panel-body">
                            <div class="col-sm-3">  <h3 class="title-hero">
                                Search For Patient (${fn:length(patientList)})
                            </h3></div>
                            <form id="fsearch" name="frm" action="Home" method="POST">
                                <input type="hidden" id="startDate" name="startDate" value="${startDate}">
                                <input type="hidden" id="endDate" name="endDate" value="${endDate}">
                                <input type="hidden" id="modality" name="modality" value="${modality}">
                                <input type="hidden" id="hospital" name="hospital" value="${hospital}">

                            <div class="col-sm-8 ">
                                <div class="input-group">
                                    <input type="text" class="form-control" value="${text}" name="text" placeholder="Enter patient name/ID/Accsion" >
                                    <span class="input-group-btn">
                                        <button class="btn btn-primary" type="submit">Search</button>
                                    </span>
                                </div>
                            </div>
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="example-box-wrapper">
                                <div class="dropdown">

                                    <a href="#" title="" class="btn btn btn-primary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                        <i class="glyph-icon icon-calendar"></i>
                                        <span>Study Date</span>
                                        <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" style="display: none;">
                                        <li><a href="#" onclick="postDate('<%=currentDate%>','<%=currentDate%>')">Today</a></li>
                                        <li><a href="#" onclick="postDate('<%=yeteday%>','<%=currentDate%>')">Yester Day</a></li>
                                        <li><a href="#" onclick="postDate('<%=weekday%>','<%=currentDate%>')">Last 7 Day</a></li>
                                        <li style="width: 200px;"><a href="#">Any Day  </a></li>
                                        <li class="divider"></li>
                                        <li><div class="input-prepend input-group">
                                    <span class="add-on input-group-addon">
                                        <i class="glyph-icon icon-calendar"></i>
                                    </span>
                                            <input type="text" name="daterangepicker-example" id="daterangepicker-example" class="form-control" value="<%=weekday%> - <%=currentDate%>">
                                        </div></li>
                                    </ul>
                                </div>
                                <div class="dropdown">
                                <a href="#" title="" class="btn btn btn-primary" data-toggle="dropdown" aria-expanded="false">
                                    <i class="glyph-icon  icon-file-excel-o"></i> Modality <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" role="menu" style="display: none;">
                                    <li><a href="#" onclick="postModality(null)">All</a></li>
                                    <c:forEach items="${modalityList}" var="mItem" varStatus="mm">
                                        <li><a href="#" onclick="postModality('${mItem.modality}')">${mItem.modality}</a></li>
                                    </c:forEach>

                                </ul>
                            </div>
                                <div class="dropdown">
                                    <a href="#" title="" class="btn btn btn-primary" data-toggle="dropdown" aria-expanded="false">
                                        <i class="glyph-icon  icon-hospital-o"></i>
                                        Hospital Name <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" style="display: none;">
                                        <li><a href="#" onclick="postInstitution(null)">All</a></li>
                                        <c:forEach items="${hospitalList}" var="hosItem" varStatus="my">
                                            <li><a href="#" onclick="postInstitution('${hosItem.institution}')">${hosItem.institution}</a></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <div class="dropdown">
                                    <a href="#" title="" class="btn btn btn-primary" onclick="clearF()" ><i class="glyph-icon  icon-hospital-o"></i> Clear All</a>
                                </div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div>

                                <div class="example-box-wrapper">

                                    <!--<link rel="stylesheet" type="text/css" href="../../assets/widgets/datatable/datatable.css">-->
                                    <script type="text/javascript" src="/assets/widgets/datatable/datatable.js"></script>
                                    <script type="text/javascript" src="/assets/widgets/datatable/datatable-bootstrap.js"></script>
                                    <script type="text/javascript" src="/assets/widgets/datatable/datatable-tabletools.js"></script>
                                    <style>#myTable_filter{display: none}</style>
                                    <script type="text/javascript">

                                        /* Datatables basic */

                                        $(document).ready(function() {

                                            var table =      $('#myTable').dataTable({
                                                paging: true,
                                                searching: true,
                                                "columnDefs": [
                                                    { "orderable": false, "targets":[1,2,3,4,5,6] },

                                                ],"info": true,
                                                "infoCallback": function( settings, start, end, max, total, pre ) {
                                                    $("#rnum").html(total);
                                                }
                                            });

                                        });
                                    </script>
                                    <table   style="font-size:12px;" cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="myTable">
                                        <thead>
                                        <tr>
                                            <th>Patient Name</th>
                                            <th>Patient ID</th>

                                            <th>Sex</th>
                                            <th>Patient's Most Recent Exam</th>
                                            <th>Report</th>
                                            <th>Note</th>
                                            <th>Key</th>
                                        </tr>
                                        </thead>
                                        <tbody >

                                        <c:forEach items="${patientList}" var="myItem" varStatus="myItemStat">

                                            <tr >
                                                <td>${myItem.pat_name}</td>
                                                <td>${myItem.pat_id}</td>
                                                <td>${myItem.pat_sex}</td>
                                                <td>${myItem.study_datetime}|${myItem.mods_in_study}|${myItem.accession_no}|${myItem.study_desc}|${myItem.series}</td>


                                                <td class="text-center"><i class="glyph-icon tooltip-button btn btn-xs
                                                <c:if test="${myItem.reportStatus==null}">hide</c:if>
                                                <c:if test="${myItem.reportStatus==1}">label-danger</c:if>
                                                <c:if test="${myItem.reportStatus==2}">label-warning</c:if>

                                                <c:if test="${myItem.reportStatus==3}">label-success</c:if>
                                                icon-file-text" title="" data-original-title="
                                                <c:if test="${myItem.reportStatus==1}">Unread</c:if>
                                                <c:if test="${myItem.reportStatus==2}">Reading</c:if>

                                                <c:if test="${myItem.reportStatus==3}">Read</c:if>"></i></td>
                                                <td class="text-center"><i class="glyph-icon tooltip-button btn btn-xs label-info icon-calendar-o" title="" data-original-title="Note"></i></td>

                                                <td class="text-center"><i class="glyph-icon tooltip-button btn btn-xs label-info icon-key" title="" data-original-title="key"></i></td>

                                            </tr>



                                        </c:forEach>

                                        </tbody>
                                    </table>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>



            </div>
        </div>
    </div>


    <!-- WIDGETS -->

    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>

    <!-- Bootstrap Dropdown -->

    <!-- <script type="text/javascript" src="assets/widgets/dropdown/dropdown.js"></script> -->

    <!-- Bootstrap Tooltip -->

    <!-- <script type="text/javascript" src="assets/widgets/tooltip/tooltip.js"></script> -->

    <!-- Bootstrap Popover -->

    <!-- <script type="text/javascript" src="assets/widgets/popover/popover.js"></script> -->

    <!-- Bootstrap Progress Bar -->

    <script type="text/javascript" src="assets/widgets/progressbar/progressbar.js"></script>

    <!-- Bootstrap Buttons -->

    <!-- <script type="text/javascript" src="assets/widgets/button/button.js"></script> -->

    <!-- Bootstrap Collapse -->

    <!-- <script type="text/javascript" src="assets/widgets/collapse/collapse.js"></script> -->

    <!-- Superclick -->

    <script type="text/javascript" src="assets/widgets/superclick/superclick.js"></script>

    <!-- Input switch alternate -->

    <script type="text/javascript" src="assets/widgets/input-switch/inputswitch-alt.js"></script>

    <!-- Slim scroll -->

    <script type="text/javascript" src="assets/widgets/slimscroll/slimscroll.js"></script>

    <!-- Slidebars -->

    <script type="text/javascript" src="assets/widgets/slidebars/slidebars.js"></script>
    <script type="text/javascript" src="assets/widgets/slidebars/slidebars-demo.js"></script>

    <!-- PieGage -->

    <script type="text/javascript" src="assets/widgets/charts/piegage/piegage.js"></script>
    <script type="text/javascript" src="assets/widgets/charts/piegage/piegage-demo.js"></script>

    <!-- Screenfull -->

    <script type="text/javascript" src="assets/widgets/screenfull/screenfull.js"></script>

    <!-- Content box -->

    <script type="text/javascript" src="assets/widgets/content-box/contentbox.js"></script>

    <!-- Overlay -->

    <script type="text/javascript" src="assets/widgets/overlay/overlay.js"></script>

    <!-- Widgets init for demo -->

    <script type="text/javascript" src="assets/js-init/widgets-init.js"></script>

    <!-- Theme layout -->

    <script type="text/javascript" src="assets/themes/admin/layout.js"></script>

    <!-- Theme switcher -->

    <script type="text/javascript" src="assets/widgets/theme-switcher/themeswitcher.js"></script>
    <!-- Bootstrap Datepicker -->

    <!--<link rel="stylesheet" type="text/css" href="assets/widgets/datepicker/datepicker.css">-->
    <script type="text/javascript" src="assets/widgets/datepicker/datepicker.js"></script>
    <script type="text/javascript">
        /* Datepicker bootstrap */



    </script>

    <!-- jQueryUI Datepicker -->

    <!--<link rel="stylesheet" type="text/css" href="assets/widgets/datepicker-ui/datepicker.css">-->
    <script type="text/javascript" src="assets/widgets/datepicker-ui/datepicker.js"></script>
    <script type="text/javascript" src="assets/widgets/datepicker-ui/datepicker-demo.js"></script>

    <!-- Bootstrap Daterangepicker -->

    <!--<link rel="stylesheet" type="text/css" href="assets/widgets/daterangepicker/daterangepicker.css">-->
    <script type="text/javascript" src="assets/widgets/daterangepicker/moment.js"></script>
    <script type="text/javascript" src="assets/widgets/daterangepicker/daterangepicker.js"></script>
    <script type="text/javascript" src="assets/widgets/daterangepicker/daterangepicker-demo.js"></script>

    <!-- Bootstrap Timepicker -->

    <!--<link rel="stylesheet" type="text/css" href="assets/widgets/timepicker/timepicker.css">-->
    <script type="text/javascript" src="assets/widgets/timepicker/timepicker.js"></script>
    <script type="text/javascript">
        function postDate(sD,eD) {
            $('#startDate').val(sD);
            $('#endDate').val(eD);
            $('#fsearch').submit();

        }
        function postModality(mo){
            $('#modality').val(mo);
            $('#fsearch').submit();
        }
        function postInstitution(mo){
            $('#hospital').val(mo);
            $('#fsearch').submit();
        }
        function clearF() {
            $('#startDate').val("");
            $('#endDate').val("");
            $('#hospital').val("");
            $('#modality').val("");
            $('#fsearch').submit();

        }
    </script>
</div>
</body>


</html>