<!DOCTYPE html>
<!--[if IE 7]>                  <html class="ie7 no-js" lang="en">     <![endif]-->
<!--[if lte IE 8]>              <html class="ie8 no-js" lang="en">     <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html class="not-ie no-js" lang="en">  <!--<![endif]-->
<head>

	<!-- Basic Page Needs
	================================================== -->
	<meta charset="utf-8">
	<title>Let's date!</title>
	<meta name="description" content="">
	<meta name="author" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	
	<!-- Mobile Specific Metas
	================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- CSS
	================================================== -->
	<!-- Normalize default styles -->
	<link rel="stylesheet" href="/byr-date/css/normalize.css" media="screen" />
	<!-- Skeleton grid system -->
	<link rel="stylesheet" href="/byr-date/css/skeleton.css" media="screen" />
	<!-- FontAwesome (Icon Fonts) -->
	<link rel="stylesheet" href="/byr-date/css/font-awesome.min.css" media="screen" />
	<!-- Base Template Styles-->
	<link rel="stylesheet" href="/byr-date/css/base.css" media="screen" />
	<!-- Template Styles-->
	<link rel="stylesheet" href="/byr-date/css/style.css" media="screen" />
	<!-- Superfish -->
	<link rel="stylesheet" href="/byr-date/css/superfish.css" media="screen" />
	<!-- Flexslider -->
	<link rel="stylesheet" href="/byr-date/css/flexslider.css" media="screen" />
	<!-- Magnific popup -->
	<link rel="stylesheet" href="/byr-date/css/magnific-popup.css" media="screen" />
	<!-- Styles for Mobile devices -->
	<link rel="stylesheet" href="/byr-date/css/responsive.css" media="screen" />
	
	
	
	
</head>

<body>
	
	<!-- BEGIN WRAPPER -->
	<div id="wrapper">
	
		<div class="main-box">
			<!-- BEGIN HEADER -->
			<header id="header" class="header">
				
				<div class="container clearfix">
					<div class="grid_4 mobile-nomargin">
						<!-- BEGIN LOGO -->
						<div id="logo" class="logo">
							<!-- Image based Logo -->
							<img src="/byr-date/images/logo.jpg" alt="Blitz" /> 
							<!-- Text based Logo 
							<h1><a href="index.html">Blitz</a></h1> -->
							
							<p class="tagline">Farewell，single life</p>
						</div>
						<!-- END LOGO -->
					</div>
					
					<div class="grid_8 mobile-nomargin">
						<!-- Main Navigation -->
						<nav class="primary clearfix">
							<!-- Menu -->
							<ul class="sf-menu">								
								<li><a href="elements.html">计划</a></li>
								<li><a href="blog.html">活动</a></li>
								<li><a href="dom/show">我们寝</a></li>
								
							</ul>
							<!-- Menu / End -->
						</nav>
						<!-- Main Navigation / End -->
					</div>
				</div>				
			</header>

			<!-- BEGIN CONTENT WRAPPER -->
            <div id="content-wrapper" class="content-wrapper">
                <div class="container">
                    <div class="clearfix">
                        <div class="grid_6">
                            <!-- Contact Form -->
                            <div class="box">
                                <form method="post" action="dom/updatedom.action" method="post" id="contact-form" class="contact-form input-blocks">
                                	<br />
                                    <div class="field">
                                        <label for="city"><strong>城市</strong> </label>
                                        <input type="text" name="city" id="city" value="$!dom.city">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="school"><strong>学校</strong> </label>
                                        <input type="text" name="school" id="school" value="$!dom.school">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="major"><strong>专业</strong> </label>
                                        <input type="text" name="major" id="major" value="$!dom.major">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="gender"><strong>性别</strong> </label>
                                        <input type="text" name="gender" id="gender" value="$!dom.gender">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="major"><strong>年级</strong> </label>
                                        <input type="grade" name="grade" id="grade" value="$!dom.grade">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="qq"><strong>QQ</strong> </label>
                                        <input type="text" name="qq" id="qq" value="$!dom.qq">
                                    </div>
                                    <br />
                                    <div class="button-wrapper">
                                        <input type="submit" name="submit" id="submit" value="提交">
                                    </div>
                                    <div id="response"></div>
                                </form>
                            </div>
                            <!-- Contact Form / End -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- END CONTENT WRAPPER -->




</body>
</html>