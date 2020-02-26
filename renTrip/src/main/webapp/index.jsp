<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

</head>
<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300" id="home-section">


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
                            <li><a href="#home-section" class="nav-link">Home</a></li>
                            <li class="has-children">
                                <a href="#about-section" class="nav-link">About</a>
                                <ul class="dropdown">
                                    <li><a href="#faq-section" class="nav-link">FAQ</a></li>
                                    <li><a href="#services-section" class="nav-link">Why RenTrip</a></li>
                                    <li><a href="#gallery-section" class="nav-link">Gallery</a></li>
                                </ul>
                            </li>
                            <li><a href="renTrip?command=bikes" class="nav-link">Bicycles</a></li>
                            <c:if test="${role eq null}">
                                <li><a href="login.jsp" class="nav-link">Sign In</a></li>
                                <li><a href="registration.jsp" class="nav-link">Sign Up</a></li>
                            </c:if>
                            <c:if test="${role != null}">
                                <li class="has-children">
                                    <a class="nav-link">${login}</a>
                                    <ul class="dropdown">
                                        <li><a href="renTrip?command=logout" class="nav-link">Log Out</a></li>
                                    </ul>
                                </li>
                            </c:if>
                        </ul>
                    </nav>
                </div>


                <div class="col-6 d-inline-block d-xl-none ml-md-0 py-3" style="position: relative; top: 3px;"><a
                        href="#" class="site-menu-toggle js-menu-toggle float-right"><span class="icon-menu h3"></span></a>
                </div>

            </div>
        </div>

    </header>


    <section class="site-blocks-cover overflow-hidden bg-light">
        <div class="container">
            <div class="row">
                <div class="col-md-7 align-self-center text-center text-md-left">
                    <div class="intro-text">
                        <h1>Explore <span class="d-md-block">The world</span></h1>
                        <p class="mb-4">Whether you are travelling and want to see the sights, <span class="d-block"> or are looking for a high performance ride in the back-country, </span>
                            we've got your bike.</p>
                    </div>
                </div>
                <div class="col-md-5 align-self-end text-center text-md-right">
                    <img src="images/dogger_img_1.jpg" alt="Image" class="img-fluid cover-img">
                </div>
            </div>
        </div>
    </section>

    <section class="site-section">
        <div class="container">
            <div class="row justify-content-center" data-aos="fade-up">
                <div class="col-lg-6 text-center heading-section mb-5">
                    <div class="paws">
                        <span class="icon-bicycle"></span>
                    </div>
                    <h2 class="text-black mb-2">Welcome to Bike Rent</h2>
                </div>
            </div>

            <div class="row hover-1-wrap mb-5 mb-lg-0">
                <div class="col-12">
                    <div class="row">
                        <div class="mb-4 mb-lg-0 col-lg-6 order-lg-2" data-aos="fade-right">
                            <a href="#" class="hover-1">
                                <img src="images/bicycle-1285149_1280.jpg" alt="Image" class="img-fluid">
                            </a>
                        </div>
                        <div class="col-lg-5 mr-auto text-lg-right align-self-center order-lg-1" data-aos="fade-left">
                            <h2 class="text-black">Have fun</h2>
                            <p class="mb-4">Whether commuting for work or using for leisure, you will enjoy RenTrip for any purpose.</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row hover-1-wrap mb-5 mb-lg-0">
                <div class="col-12">
                    <div class="row">
                        <div class="mb-4 mb-lg-0 col-lg-6" data-aos="fade-left">
                            <a href="#" class="hover-1">
                                <img src="images/img-69061-15777042421570.jpg" alt="Image" class="img-fluid">
                            </a>
                        </div>
                        <div class="col-lg-5 ml-auto align-self-center" data-aos="fade-right">
                            <h2 class="text-black">Get exercise</h2>
                            <p class="mb-4">Biking is great exercise. Reduce your stress and improve your health.</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row hover-1-wrap">
                <div class="col-12">
                    <div class="row">
                        <div class="mb-4 mb-lg-0 col-lg-6 order-lg-2" data-aos="fade-right">
                            <a href="#" class="hover-1">
                                <img src="images/bicycle-1850861_1280.jpg" alt="Image" class="img-fluid">
                            </a>
                        </div>
                        <div class="col-lg-5 mr-auto text-lg-right align-self-center order-lg-1" data-aos="fade-left">
                            <h2 class="text-black">Go green</h2>
                            <p class="mb-4">By saving on gasoline, preventing carbon emissions and keeping pollutants out of the air, biking is not only good for you, but also good for the environment.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="site-section" id="about-section">
        <div class="container">
            <div class="row justify-content-center" data-aos="fade-up">
                <div class="col-lg-5 align-self-center mr-auto text-left heading-section mb-5">
                    <div class="paws ml-4" style="left: 37px">
                        <span class="icon-bicycle"></span>
                    </div>
                    <h2 class="text-black mb-3">About Us</h2>
                    <p class="text-muted mb-4">RenTrip is the public bike rent system in Minsk.<br/>
                        We buy our bikes only from top manufacturers, and we keep up with the latest trends in the industry to make sure we're providing you with the best possible mountain or hybrid bikes. We also offer super-cushy gel seats at no additional cost.<br/>
                        We keep our rental fleet constantly updated, so you're sure to get a top-flight ride. And every time one of our bikes is returned after a rental, our experienced mechanics give it a thorough inspection to make sure it's in perfect operating condition. What that means for you is great equipment, superb service and a fantastic day of biking.
                    </p>

                </div>
                <div class="col-lg-6 text-left heading-section mb-5" data-aos="fade-up" data-aos-delay="100">
                        <img src="images/pexels-photo-3625740.jpg" alt="Image" class="img-fluid">
                </div>
            </div>
        </div>
    </section>

    <section class="site-section" id="faq-section">
        <div class="container" id="accordion">
            <div class="row justify-content-center" data-aos="fade-up">
                <div class="col-lg-6 text-center heading-section mb-5">
                    <div class="paws">
                        <span class="icon-bicycle"></span>
                    </div>
                    <h2 class="text-black mb-2">Frequently Ask Questions</h2>
                </div>
            </div>
            <div class="row accordion justify-content-center block__76208">
                <div class="col-lg-6 order-lg-2 mb-5 mb-lg-0" data-aos="fade-up" data-aos-delay="">
                    <img src="images/gallery_img_4.jpg" alt="Image" class="img-fluid rounded">
                </div>
                <div class="col-lg-5 mr-auto order-lg-1" data-aos="fade-up" data-aos-delay="100">
                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseFive" role="button"
                               aria-expanded="true" aria-controls="collapseFive">Can I walk in and rent a bicycle?
                                <span class="icon"></span></a>
                        </h3>
                        <div id="collapseFive" class="collapse show" aria-labelledby="headingOne"
                             data-parent="#accordion">
                            <div class="body-text">
                                <p>Unfortunately, we only do online reservations.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseSix" role="button"
                               aria-expanded="false" aria-controls="collapseSix">Is a deposit required when I rent a bicycle?
                                <span class="icon"></span></a>
                        </h3>
                        <div id="collapseSix" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>No, but we do require a valid passport. The renter is responsible for any damaged
                                    caused to the bicycle while in their possession.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseSeven" role="button"
                               aria-expanded="false" aria-controls="collapseSeven">Can I rent more than one bike at a time?
                                <span class="icon"></span></a>
                        </h3>
                        <div id="collapseSeven" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>Yes. Users are able to rent up to three bikes at a time on their account.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseEight" role="button"
                               aria-expanded="false" aria-controls="collapseEight">What if I want to keep a
                                bike all day or longer?<span class="icon"></span></a>
                        </h3>
                        <div id="collapseEight" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>We only do daily rentals. All bicycles must be returned the same day.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseNine" role="button"
                               aria-expanded="false" aria-controls="collapseNine">What should I wear while
                                riding one of our rental bicycles?<span class="icon"></span></a>
                        </h3>
                        <div id="collapseNine" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>We suggest you to wear something casual and comfortable, appropriate dress for the
                                    weather conditions is advised. We also recommend wearing closed toed shoes;
                                    sandals or flip-flops are discouraged because of the high chances of toe injuries
                                    as well as the chance that they may fall off your feet while riding creating a
                                    safety hazard.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseTen" role="button"
                               aria-expanded="false" aria-controls="collapseTen">What if I have questions
                                about how to operate the bike?<span class="icon"></span></a>
                        </h3>
                        <div id="collapseTen" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>No problem! Please feel free to ask any of our employees for help when you pick up your rental.
                                    We'll make sure you are comfortable and confident with operating our equipment.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->

                    <div class="accordion-item">
                        <h3 class="mb-0 heading">
                            <a class="btn-block" data-toggle="collapse" href="#collapseEleven" role="button"
                               aria-expanded="false" aria-controls="collapseEleven">What if I have a flat tire?
                                <span class="icon"></span></a>
                        </h3>
                        <div id="collapseEleven" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="body-text">
                                <p>Call us at +375 29 666 66 66 and we will come and either fix the flat or replace the whole bicycle.</p>
                            </div>
                        </div>
                    </div> <!-- .accordion-item -->
                </div>
            </div>
        </div>
    </section>

    <section class="site-section " id="services-section">
        <div class="container">
            <div class="row justify-content-center" data-aos="fade-up">
                <div class="col-lg-6 text-center heading-section mb-5">
                    <div class="paws">
                        <span class="icon-bicycle"></span>
                    </div>
                    <h2 class="text-black mb-2">Why RenTrip?</h2>
                </div>
            </div>
            <br/>
            <br/>
            <br/>
            <div class="row">
                <div class="col-md-6 mb-4 col-lg-4" data-aos="fade-up" data-aos-delay="">
                    <div class="block_service">
                        <div class="icons">
                            <span class="icon-map-marker"></span>
                        </div>
                        <h3>Always one close to you</h3>
                        <p>Pick-up or leave your bike at any of our locations.</p>
                    </div>
                </div>
                <div class="col-md-6 mb-4 col-lg-4" data-aos="fade-up" data-aos-delay="100">
                    <div class="block_service">
                        <div class="icons">
                            <span class="icon-clock-o"></span>
                        </div>
                        <h3>Longest shop hours</h3>
                        <p>We have the longest opening hours in Minsk. No worries about bringing in your bike (too) late.</p>
                    </div>
                </div>
                <div class="col-md-6 mb-4 col-lg-4" data-aos="fade-up" data-aos-delay="200">
                    <div class="block_service">
                        <div class="icons">
                            <span class="icon-heart"></span>
                        </div>
                        <h3>Bikes for everyone</h3>
                        <p>We have a wide range of bikes to make sure that the whole family can take the bike.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="site-section" id="gallery-section">
        <div class="container-fluid">
            <div class="row justify-content-center" data-aos="fade-up">
                <div class="col-lg-6 text-center heading-section mb-5">
                    <div class="paws">
                        <span class="icon-bicycle"></span>
                    </div>
                    <h2 class="text-black mb-2">Photo Gallery</h2>
                </div>
            </div>
            <div class="row no-gutters">

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-0531cae0e662.jpeg" data-fancybox="gal"><img src="images/photo-0531cae0e662.jpeg"
                                                                                  alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/gallery_img_2.jpg" data-fancybox="gal"><img src="images/gallery_img_2.jpg"
                                                                              alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-2e524f15f231.jpeg" data-fancybox="gal"><img src="images/photo-2e524f15f231.jpeg"
                                                                                  alt="Image" class="img-fluid"></a>
                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/bicycle-2492347_1280.jpg" data-fancybox="gal"><img src="images/bicycle-2492347_1280.jpg"
                                                                                   alt="Image" class="img-fluid"></a>


                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-1555094537-b2bf3757c798.jpeg" data-fancybox="gal"><img src="images/photo-1555094537-b2bf3757c798.jpeg"
                                                                              alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-156-f6b2d5.jpeg" data-fancybox="gal"><img src="images/photo-156-f6b2d5.jpeg"
                                                                              alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-153d53.jpeg" data-fancybox="gal"><img src="images/photo-153d53.jpeg"
                                                                              alt="Image" class="img-fluid"></a>


                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/kot-svet-progulka.jpg" data-fancybox="gal"><img src="images/kot-svet-progulka.jpg"
                                                                                alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/bicycle-1285149_1280.jpg" data-fancybox="gal"><img src="images/bicycle-1285149_1280.jpg"
                                                                              alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo-1541502821057-f6a7bbfe1f51.jpeg" data-fancybox="gal"><img src="images/photo-1541502821057-f6a7bbfe1f51.jpeg"
                                                                                                alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/photo--fb4cc491a229.jpeg" data-fancybox="gal"><img src="images/photo--fb4cc491a229.jpeg"
                                                                              alt="Image" class="img-fluid"></a>

                <a class="col-6 col-md-6 col-lg-4 col-xl-3 gal-item d-block" data-aos="fade-up" data-aos-delay="100"
                   href="images/bicycle-1850861_1280.jpg" data-fancybox="gal"><img src="images/bicycle-1850861_1280.jpg"
                                                                                   alt="Image" class="img-fluid"></a>
            </div>
        </div>
    </section>


    <footer class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-9">
                    <div class="row">
                        <%--<div class="col-md-5">
                            <h2 class="footer-heading mb-4">About Us</h2>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Neque facere laudantium magnam
                                voluptatum autem. Amet aliquid nesciunt veritatis aliquam.</p>
                        </div>--%>
                        <div class="col-md-5 ml-auto">
                            <h2 class="footer-heading mb-4">Quick Links</h2>
                            <ul class="list-unstyled">
                                <li><a href="#about-section" class="smoothscroll">About Us</a></li>
                                <li><a href="#faq-section" class="smoothscroll">FAQ</a></li>
                                <li><a href="#services-section" class="smoothscroll">Why RenTrip</a></li>
                                <li><a href="#gallery-section" class="smoothscroll">Gallery</a></li>
                            </ul>
                        </div>
                        <div class="col-md-5 ml-auto">
                            <h2 class="footer-heading mb-4">Customer service</h2>
                            <ul class="list-unstyled">
                                Every day from 9:00 AM till 11:00 PM
                            </ul>
                            <ul class="list-unstyled">
                                Phone: +375 44 404 40 40
                            </ul>
                            <ul class="list-unstyled">
                                Email: rentrip@gmail.com
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
                            All rights reserved | <i class="icon-heart text-danger"
                                                                                aria-hidden="true"></i> <a
                                href="https://colorlib.com" target="_blank">RenTrip</a>
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
