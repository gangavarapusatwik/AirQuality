$(window).on('load', function () {
    $('.preloader').fadeOut(600);

});

jQuery(function () {

    // smooth scrolling
    //$('.navbar-nav li a, .nav-footer li a, .smooth-scroll').on('click', function (e) {
    //    debugger;
    //    e.preventDefault();
    //    var spaceOffset = 145; // you may change this value as needed
    //    $('html,body').animate({

    //        scrollTop: $(this.hash).offset().top - spaceOffset
    //    }, 800);
    //});
    $('html, body').animate({ scrollTop: $('.auto-scroll').offset().top - 100 }, 'slow');



    $(window).bind('load resize', function () {
        if ($(window).width() < 769) {
            /* hide collapsible menu once menu item clicked on mobile */
            $('.navbar-nav li a').on('click', function () {
                if ($(this).parents('.navbar-collapse.collapse').hasClass('in')) {
                    $('#main-navbar').collapse('hide');
                }
            });
        }
    });

    // navigation bar
    $(window).scroll(function () {
        if ($(document).scrollTop() > 100) {
            $('.navbar-fixed-top').addClass('navbar-scroll-mode');
            $('.navbar-brand .logo').attr('src', 'images/logo.png');
            $('.nav-icon span').css('background-color', '#ffffff');
        } else {
            $('.navbar-fixed-top').removeClass('navbar-scroll-mode');
            $('.navbar-brand .logo').attr('src', 'images/logo.png');
            $('.nav-icon span').css('background-color', '');
        }
    });

    // mobile navigation icon
    $('#main-navbar').on('show.bs.collapse', function () {
        $('.nav-icon').addClass('open');
    });

    $('#main-navbar').on('hide.bs.collapse', function () {
        $('.nav-icon').removeClass('open');
    });



    // hero unit
    var theSwiper = new Swiper('.swiper-container', {
        speed: 1500,
        autoplay: 3000,
        loop: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        effect: 'fade',
        keyboardControl: true,
        fade: {
            crossFade: true
        }
    });



    // video background
    if ($('.video-background').length) {
        $('#hero-video').vide({
            mp4: 'images/video1.mp4',
            //webm: '/Scripts/User_Tamplate/images/coding.webm',
            //ogv: '/Scripts/User_Tamplate/images/coding.ogv',
            poster: 'images/alt-img-video.jpg',
        }, {
            posterType: 'jpg'
        });
    }
});

//window.onload = function () {
//    $('html, body').animate({ scrollTop: $('#hero-video').offset().top - 100 }, 'slow');
//};
