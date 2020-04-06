<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link href="css/login.css" rel='stylesheet' type='text/css'/>
    <script type="text/javascript">
        function display_time() {
            <c:forEach var="order" items="${orders}">
            var x =  Math.ceil(((new Date().getTime() - ${order.time}) * ${order.cost}) / (1000 * 60 * 60));
            document.getElementById(${order.id}).innerHTML = x;
            mytime=setTimeout('display_time()',1000);
            </c:forEach>
            }
    </script>
</head>
<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300" id="orders" onload=display_time();>


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
                                    <li><a href="index.jsp#services-section" class="nav-link">Why RenTrip</a></li>
                                    <li><a href="index.jsp#gallery-section" class="nav-link">Gallery</a></li>
                                </ul>
                            </li>
                            <li><a href="renTrip?command=bikes" class="nav-link">Bicycles</a></li>
                            <c:if test="${role != null}">
                                <c:if test="${role eq 'admin'}">
                                    <li><a href="addBike.jsp" class="nav-link">Add Bike</a></li>
                                </c:if>
                                <li><a href="renTrip?command=get_orders" class="nav-link">Orders</a></li>
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

    <div class="site-section bg-light">
        <c:if test="${invalid != null}">
            <div style="background: rgba(0, 0, 0, 0.4); text-align: center; margin-bottom: 1.5em;">${invalid}</div>
        </c:if>
        <div class="container">
            <div class="row">

                <c:forEach items="${orders}" var="order">
                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="item-1">

                            <a href="#"><img src="${order.image}" alt="Image" class="img-fluid"></a>
                            <div class="item-1-contents">
                                <div class="text-center">
                                    <h3>Order</h3>
                                    <div class="rent-price"><span>
                                        <c:if test="${!order.status}">
                                            (Pending confirmation)
                                        </c:if>
                                        <c:if test="${order.status}">
                                            (In process)
                                        </c:if>
                                    </span></div>
                                </div>
                                    <li>
                                        <span>Model:</span>
                                        <span class="spec">${order.name}</span>
                                    </li>
                                    <li>
                                        <span>Cost:</span>
                                        <span class="spec">$${order.cost}/hour</span>
                                    </li>
                                    <li>
                                        <span>Address:</span>
                                        <span class="spec">${order.address}</span>
                                    </li>
                                    <c:if test="${role eq 'admin'}">
                                        <li>
                                            <span>Nickname:</span>
                                            <span class="spec">${order.login}</span>
                                        </li>
                                        <li>
                                            <span>Phone:</span>
                                            <span class="spec">${order.phone}</span>
                                        </li>
                                    </c:if>
                                    <c:if test="${order.status}">
                                        <h5 style="text-align: center; color: #0b0b0b">To pay: <span id="${order.id}"></span>$</h5>
                                    </c:if>
                                <c:if test="${!order.status}">
                                    <form action="${pageContext.request.contextPath}/renTrip" method="post" style="display: inline">
                                        <input type="hidden" name="order_id" value="${order.id}"/>
                                        <input type="submit" value="Cancel" style="background-color: #814650; border-color: #814650;" class="btn btn-primary">
                                        <input type="hidden" name="command" value="cancel_order"/>
                                    </form>
                                </c:if>

                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
    <footer class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-9">
                    <div class="row">
                        <div class="col-md-5 ml-auto">

                            <h2 class="footer-heading mb-4">Quick Links</h2>
                            <ul class="list-unstyled">
                                <li><a href="index.jsp#about-section" class="smoothscroll">About Us</a></li>
                                <li><a href="index.jsp#faq-section" class="smoothscroll">FAQ</a></li>
                                <li><a href="index.jsp#services-section" class="smoothscroll">Why RenTrip</a></li>
                                <li><a href="index.jsp#gallery-section" class="smoothscroll">Gallery</a></li>
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
                                                     aria-hidden="true"></i> RenTrip
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </small></p>

                    </div>
                </div>

            </div>
        </div>
    </footer>


</div><!-- .site-wrap -->

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

