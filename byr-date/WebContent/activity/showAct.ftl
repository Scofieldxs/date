
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
								<li><a href="/byr-date/dom/show.action?id='$!id'">我们寝</a></li>
								
							</ul>
							<!-- Menu / End -->
						</nav>
						<!-- Main Navigation / End -->
					</div>
				</div>
				
			</header>
			<!-- END HEADER -->

			
			
			<!-- BEGIN CONTENT WRAPPER -->
			<div id="content-wrapper" class="content-wrapper">
				<div class="container">

					<div class="clearfix">
						<div class="grid_12">
							<figure class="thumb thumb-fullw-mobile"><img src="/byr-date/images/act1.jpg" height="200" width="266" alt=""></figure>
							<br />
							<br />
							<br />
							<br />
							<h4>活动：${activity.activity}</h4>
							<br />
							<br />
							<h4>时间：${activity.time}</h4>
							
						</div>
					</div>

					<div class="hr"></div>
					

					<!-- Our Staff -->
					<div class="clearfix">
						<div class="grid_12">
							<h3>对方寝室</h3>
						</div>
						<ul class="contact-info">
							<li>
								<i class="icon-map-marker"></i> <strong>学校:&nbsp; &nbsp; ${activity.dormitoryVo.school}</strong> 
								<i class="icon-phone"></i> <strong>&nbsp; &nbsp; &nbsp; &nbsp;专业:&nbsp; &nbsp; ${activity.dormitoryVo.major}</strong> 
								<i class="icon-envelope"></i> <strong>&nbsp; &nbsp; &nbsp; &nbsp;年级:&nbsp; &nbsp; ${activity.dormitoryVo.grade}</strong> 
								<i class="icon-globe"></i><strong>&nbsp; &nbsp; &nbsp; &nbsp;QQ:&nbsp; &nbsp; ${activity.dormitoryVo.qq}</strong> 
							</li>
							
						</ul> 
					</div>
						
					<div class="clearfix">
						<div class="grid_12">
							<div class="clearfix">
								<!-- Project Feed -->
								<div class="project-feed">
								   <div class="grid_3 project-item design logo">
										<div class="project-item-inner">
											<figure class="project-img">
												<img src="/byr-date/images/folio-img-s-1.jpg" height="147" width="200" alt="" />
												<div class="overlay">
													<a href="portfolio-single.html" class="dlink"><i class="icon-link"></i></a>
												</div>
											</figure>
											<div class="project-desc">
												<h3 class="title"><a href="#">图片列表 #1</a></h3>
												<span class="desc">first one</span>
											</div>
										</div>
								   </div>
								   <div class="grid_3 project-item design graphic">
								      <div class="project-item-inner">
											<figure class="project-img">
												<img src="/byr-date/images/folio-img-s-2.jpg" height="147" width="200" alt="" />
												<div class="overlay">
													<a href="portfolio-single.html" class="dlink"><i class="icon-link"></i></a>
													
												</div>
											</figure>
											<div class="project-desc">
												<h3 class="title"><a href="#">图片列表 #2</a></h3>
												<span class="desc">second one</span>
											</div>
										</div>
								   </div>
								</div>
							</div>
						</div>
					</div>


					<div class="hr"></div>
				</div>
			</div>
		</div>
	</div>

<script type="text/javascript">
    /**
     * grid初始化
     */
    $(document).ready(function(){
					
			
	
	
</body>
</html>