
<!DOCTYPE html>

<html class="not-ie no-js" lang="en">  
<head>

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
    ================================================== -->
    <!-- Normalize default styles -->
    <link rel="stylesheet" href="css/normalize.css" media="screen" />
    <!-- Skeleton grid system -->
    <link rel="stylesheet" href="css/skeleton.css" media="screen" />
    <!-- FontAwesome (Icon Fonts) -->
    <link rel="stylesheet" href="css/font-awesome.min.css" media="screen" />
    <!-- Base Template Styles-->
    <link rel="stylesheet" href="css/base.css" media="screen" />
    <!-- Template Styles-->
    <link rel="stylesheet" href="css/style.css" media="screen" />
    <!-- Superfish -->
    <link rel="stylesheet" href="css/superfish.css" media="screen" />
    <!-- Flexslider -->
    <link rel="stylesheet" href="css/flexslider.css" media="screen" />
    <!-- Magnific popup -->
    <link rel="stylesheet" href="css/magnific-popup.css" media="screen" />
    <!-- Styles for Mobile devices -->
    <link rel="stylesheet" href="css/responsive.css" media="screen" />
    
    
    
    
    
</head>

<body>
    
    <!-- BEGIN WRAPPER -->
    <div id="wrapper">
     
        <div class="main-box">

            <!-- BEGIN CONTENT WRAPPER -->
            <div id="content-wrapper" class="content-wrapper">
                <div class="container">
                    <div class="clearfix">
                        <div class="grid_6">
                            <!-- Google Map -->
                            <h3>Farewell，single</h3>
                            <div class="map-wrapper map-wrapper__small">
                                <div id="map_canvas" class="map-canvas map-canvas__small"></div>
                            </div>
                            
                        </div>
                        <!--**************************** -->
                        <div class="grid_6">
                            <h3>登 陆</h3>
                            <!-- Contact Form -->
                            <div class="box">
                                <form method="post" action="loginCheck.action" method="post" id="contact-form" class="contact-form input-blocks">
                                    <br />
                                    <div class="field">
                                        <label for="name"><strong>用户名</strong> (email)</label>
                                        <input type="text" name="name" id="name">
                                    </div>
                                    <br />
                                    <div class="field">
                                        <label for="passowrd"><strong>密码</strong> (required)</label>
                                        <input type="text" name="password" id="passowrd">
                                    </div>
                                    <br />
                                    <div class="button-wrapper">
                                        <input type="submit" name="submit" id="submit" value="登陆">
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
            
            
        </div>
            
        
    </div>
    <!-- END WRAPPER -->
    

    
    
    
</body>
</html>