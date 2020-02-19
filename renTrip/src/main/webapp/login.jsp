<!doctype html>
<html lang="en">
<head>
    <title>RenTrip &mdash; Website Template by Colorlib</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700, 900|Vollkorn:400i" rel="stylesheet">
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <link rel="stylesheet" href="css/jquery.fancybox.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">

    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">


    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Meta-Tags -->
    <!-- Stylesheets -->
    <link href="css/login.css" rel='stylesheet' type='text/css'/>
    <!-- online fonts-->
    <link href="https://fonts.googleapis.com/css?family=Amiri:400,400i,700,700i" rel="stylesheet">

</head>
<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300" id="login">


<div id="overlayer"></div>
<div class="loader">
    <div class="spinner-border text-primary" role="status">
        <span class="sr-only">Loading...</span>
    </div>
</div>


<div class="site-wrap">

    <div class="site-mobile-menu site-navbar-target">
        <div class="site-mobile-menu-header">
            <div class="site-mobile-menu-close mt-3">
                <span class="icon-close2 js-menu-toggle"></span>
            </div>
        </div>
        <div class="site-mobile-menu-body"></div>
    </div>


    <header class="site-navbar js-sticky-header site-navbar-target" role="banner">

        <div class="container">
            <div class="row align-items-center">

                <div class="col-6 col-xl-2">
                    <h1 class="mb-0 site-logo"><a href="index.jsp" class="h2 mb-0">RenTrip<span
                            class="text-primary">.</span> </a></h1>
                </div>

                <div class="col-12 col-md-10 d-none d-xl-block">
                    <nav class="site-navigation position-relative text-right" role="navigation">

                        <ul class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
                            <li><a href="index.jsp#home-section" class="nav-link">Home</a></li>
                            <li class="has-children">
                                <a href="index.jsp#about-section" class="nav-link">About</a>
                                <ul class="dropdown">
                                    <li><a href="index.jsp#faq-section" class="nav-link">FAQ</a></li>
                                    <li><a href="index.jsp#services-section" class="nav-link">Services</a></li>
                                    <li><a href="index.jsp#gallery-section" class="nav-link">Gallery</a></li>
                                </ul>
                            </li>
                            <li><a href="bicycles.jsp" class="nav-link">Bicycles</a></li>
                            <li><a href="#login" class="nav-link">Sign In</a></li>
                            <li><a href="registration.jsp" class="nav-link">Sign Up</a></li>
                        </ul>
                    </nav>
                </div>


                <div class="col-6 d-inline-block d-xl-none ml-md-0 py-3" style="position: relative; top: 3px;"><a
                        href="#" class="site-menu-toggle js-menu-toggle float-right"><span class="icon-menu h3"></span></a>
                </div>

            </div>
        </div>

    </header>


    <!--  particles  -->
    <div id="particles-js"></div>
    <!-- //particles -->
    <div class="w3ls-pos">
        <br/>
        <br/>
        <div class="w3ls-login box">
            <!-- form starts here -->
            <form action="#" method="post">
                <div class="agile-field-txt">
                    <input type="text" name="phone" placeholder="+375 33 123 45 67" required=""/>
                </div>
                <div class="agile-field-txt">
                    <input type="password" name="password" placeholder="******" required="" id="myInput"/>
                </div>
                <div class="w3ls-bot">
                    <input type="submit" value="LOGIN" class="btn btn-primary">
                </div>
            </form>
        </div>

    </div>
    <!-- scripts required  for particle effect -->
    <script src='${pageContext.request.contextPath}/js/particles.min.js'></script>
    <script src="js/index.js"></script>
    <!-- //scripts required for particle effect -->

    <footer class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-9">
                    <div class="row">
                        <div class="col-md-5">
                            <h2 class="footer-heading mb-4">About Us</h2>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Neque facere laudantium magnam
                                voluptatum autem. Amet aliquid nesciunt veritatis aliquam.</p>
                        </div>
                        <div class="col-md-3 ml-auto">
                            <h2 class="footer-heading mb-4">Quick Links</h2>
                            <ul class="list-unstyled">
                                <li><a href="index.jsp#about-section" class="smoothscroll">About Us</a></li>
                                <li><a href="index.jsp#faq-section" class="smoothscroll">FAQ</a></li>
                                <li><a href="index.jsp#services-section" class="smoothscroll">Services</a></li>
                                <li><a href="index.jsp#gallery-section" class="smoothscroll">Gallery</a></li>
                            </ul>
                        </div>
                        <div class="col-md-3 ml-auto">
                            <h2 class="footer-heading mb-4">Contacts</h2>
                            <ul class="list-unstyled">
                                +375 33 666 666 666
                            </ul>
                            <h2 class="footer-heading mb-4">Address</h2>
                            <ul class="list-unstyled">
                                Minsk
                            </ul>
                            <h2 class="footer-heading mb-4">Timetable</h2>
                            <ul class="list-unstyled">
                                10:00 - 18:00
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row pt-5 mt-5 text-center">
                <div class="col-md-12">
                    <div class="border-top pt-5">
                        <p class="copyright"><small>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                            All rights reserved | This template is made with <i class="icon-heart text-danger"
                                                                                aria-hidden="true"></i> by <a
                                href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </small></p>

                    </div>
                </div>

            </div>
        </div>
    </footer>


</div> <!-- .site-wrap -->

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.countdown.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/aos.js"></script>
<script src="js/jquery.fancybox.min.js"></script>
<script src="js/jquery.sticky.js"></script>
<script src="js/isotope.pkgd.min.js"></script>


<script src="js/main.js"></script>


</body>
</html>

