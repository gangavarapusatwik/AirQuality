	/*Clock design code - v0.5 April 27th*/
	function minusNinetyDegrees(rad) {
	    var newRad = 0;
	    var deg = (180 / Math.PI) * rad;
	    deg += 270;
	    newRad = (Math.PI / 180) * deg;
	    return newRad;
	}

	// function to find screen width any time
	// used below in a couple of functions in .resize() and .click()
	function windowSize() {
	    windowHeight = window.innerHeight ? window.innerHeight : $(window).height();
	    windowWidth = window.innerWidth ? window.innerWidth : $(window).width();
	}

	function drawClock(prodNumber) {
	    var WinHeigght = $(window).height();
	    var canvas = document.getElementById("canvas");
	    var sW = parseInt($(canvas).width()); //width
	    var sH = parseInt(sW * 0.7); //height
	    sH = 650 > sH ? sH : 490;
	    var extRadius = parseInt(sH * 0.4);
	    var smiddleL = parseInt(sH / 2 - extRadius);
	    canvas.width = sW;
	    canvas.height = sH;
	    var context = canvas.getContext("2d");
	    var pointerX;
	    var pointerY;
	    var position = $("canvas").offset();
	    var canvasX = position.left;
	    var canvasY = position.top;
	    context.clearRect(0, 0, sW, sH);
	    document.onmousemove = function (e) {
	        pointerX = e.pageX;
	        pointerY = e.pageY;
	    }

	    // resets mobile dropdown and toggle arrow if the page has been resized
	    // if section is open and screen resized, two center descriptions will overlay otherwise

	    function resizedw() {
	        var slices = $(".product-circle h3 a").length;
	        if (slices != 0)
	            drawClock(slices);
	        console.log("draw");
	    }

	    var doit;
	    $(window).resize(function () {
	        windowSize();
	        clearTimeout(doit);
	        doit = setTimeout(resizedw, 100);
	        if (windowWidth > 768) {
	            $(".circle-products").removeClass("in");
	            $(".feature-toggle span").removeClass("rotate90");
	        };
	    });

	    // updated click function to only apply on 768px and up screens
	    $(".circle-products:not(.mousemove)").click(function (e) {
	        windowSize();
	        if (windowWidth > 768) {
	            // start initial code
	            if ($(e.target).is('a'))
	                return;
	            if ($(e.target).find("a").length > 0)
	                $(e.target).find("a")[0].click();
	            else
	                $(e.target).parent().find("a")[0].click();
	            // end initial code
	        }
	    });

	    var linksRight = [],
	        linksLeft = [],
	        links = [];
	    $(".circle-products:not(.mousemove)").each(function () {
	        if ($(this).position().left > (sW / 2 - extRadius))
	            linksRight.push({
	                anchor: $(this),
	                top: $(this).position().top
	            })
	    });
	    linksRight.sort(function (a, b) {
	        return ((a["top"] < b["top"]) ? -1 : ((a["top"] > b["top"]) ? 1 : 0));
	    });
	    $(".circle-products:not(.mousemove)").each(function () {
	        if ($(this).position().left < (sW / 2 - extRadius))
	            linksLeft.push({
	                anchor: $(this),
	                top: $(this).position().top
	            })
	    });
	    linksLeft.sort(function (a, b) {
	        return ((a["top"] > b["top"]) ? -1 : ((a["top"] < b["top"]) ? 1 : 0));
	    });
	    links = linksRight.concat(linksLeft);


	    var pieAngle = 2 * Math.PI / prodNumber;
	    var radius = extRadius;
	    var prodIncrease = 1;
	    var piePieces = [];
	    //var features = new Array("l","v","m","w","mini","ea","e","k");
	    for (var i = 0; i < prodNumber; i++) {
	        context.beginPath();
	        context.moveTo((sW / 2), (sH / 2));
	        var firstRad = minusNinetyDegrees(i * pieAngle);
	        var secRad = minusNinetyDegrees((i + 1) * pieAngle);
	        context.arc((sW / 2), (sH / 2), radius, firstRad, secRad);
	        context.fillStyle = "#E6E6E6";
	        context.fill();
	        context.lineWidth = 4;
	        context.strokeStyle = '#ffffff';
	        context.stroke();
	        // push circle info as objects:
	        piePieces.push({
	            id: "product-" + (i + 1),
	            startingPoint: firstRad,
	            endingPoint: secRad,
	            mainArrisX: (sW / 2) + (radius * Math.cos(firstRad)),
	            mainArrisY: (sH / 2) + (radius * Math.sin(firstRad)),
	            featureId: "features-" + (i + 1),
	            radius: extRadius,
	            edges: [],
	            points: []
	        });
	    }

	    context.beginPath();
	    context.moveTo((sW / 2), (sH / 2));
	    radius = parseInt(extRadius * 0.86);
	    context.lineWidth = 0;
	    context.arc((sW / 2), (sH / 2), radius, 0, 2 * Math.PI);
	    context.fillStyle = "#FFFFFF";
	    context.fill();
	    context.stroke();
	    context.beginPath();
	    context.lineWidth = 4;
	    context.moveTo((sW / 2), (smiddleL + 35)); //smiddleL+35=dif between white/grey circles
	    context.lineTo((sW / 2), smiddleL);
	    context.stroke();

	    /*Cuadricula-----------------------------------*/
	    context.beginPath();
	    context.strokeStyle = '#E6E6E6';
	    context.lineWidth = 4;

	    /*Needed lines*/
	    context.moveTo((sW / 2), smiddleL + 2);
	    context.lineTo((sW / 2), 4);

	    /*central top line*/
	    piePieces[0].points.push({
	        x: (sW / 2),
	        y: smiddleL + 2
	    });
	    piePieces[0].points.push({
	        x: (sW / 2),
	        y: 4
	    });
	    piePieces[0].edges.push({
	        x1: (sW / 2),
	        y1: smiddleL + 2,
	        x2: (sW / 2),
	        y2: 4
	    });
	    piePieces[piePieces.length - 1].points.push({
	        x: (sW / 2),
	        y: smiddleL + 2
	    });
	    piePieces[piePieces.length - 1].points.push({
	        x: (sW / 2),
	        y: 4
	    });
	    piePieces[piePieces.length - 1].edges.push({
	        x1: (sW / 2),
	        y1: smiddleL + 2,
	        x2: (sW / 2),
	        y2: 4
	    });

	    context.moveTo(0, 4);
	    context.lineTo((sW), 4);

	    /*top line*/
	    piePieces[0].points.push({
	        x: (sW / 2),
	        y: 4
	    });
	    piePieces[0].points.push({
	        x: (sW),
	        y: 4
	    });
	    piePieces[0].edges.push({
	        x1: (sW / 2),
	        y1: 4,
	        x2: (sW),
	        y2: 4
	    });
	    piePieces[piePieces.length - 1].points.push({
	        x: 0,
	        y: 4
	    });
	    piePieces[piePieces.length - 1].points.push({
	        x: (sW / 2),
	        y: 4
	    });
	    piePieces[piePieces.length - 1].edges.push({
	        x1: 0,
	        y1: 4,
	        x2: (sW / 2),
	        y2: 4
	    });

	    context.moveTo(0, (sH - 4));
	    context.lineTo((sW), (sH - 4));

	    if (prodNumber % 2 == 0) {
	        context.moveTo((sW / 2), (sH - smiddleL - 2));
	        context.lineTo((sW / 2), (sH - 4));
	        prodIncrease--;

	        /*central bottom line*/
	        piePieces[prodNumber / 2 - 1].points.push({
	            x: (sW / 2),
	            y: (sH - smiddleL - 2)
	        });
	        piePieces[prodNumber / 2 - 1].points.push({
	            x: (sW / 2),
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2 - 1].edges.push({
	            x1: (sW / 2),
	            y1: (sH - smiddleL - 2),
	            x2: (sW / 2),
	            y2: (sH - 4)
	        });
	        piePieces[prodNumber / 2].points.push({
	            x: (sW / 2),
	            y: (sH - smiddleL - 2)
	        });
	        piePieces[prodNumber / 2].points.push({
	            x: (sW / 2),
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2].edges.push({
	            x1: (sW / 2),
	            y1: (sH - smiddleL - 2),
	            x2: (sW / 2),
	            y2: (sH - 4)
	        });

	        /*bottom line*/
	        piePieces[prodNumber / 2 - 1].points.push({
	            x: (sW / 2),
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2 - 1].points.push({
	            x: (sW),
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2 - 1].edges.push({
	            x1: (sW / 2),
	            y1: (sH - 4),
	            x2: (sW),
	            y2: (sH - 4)
	        });
	        piePieces[prodNumber / 2].points.push({
	            x: 0,
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2].points.push({
	            x: (sW / 2),
	            y: (sH - 4)
	        });
	        piePieces[prodNumber / 2].edges.push({
	            x1: 0,
	            y1: (sH - 4),
	            x2: (sW / 2),
	            y2: (sH - 4)
	        });
	    }
	    context.stroke();

	    /*Left Side Lines*/
	    context.beginPath();
	    var quadLines = parseInt(prodNumber / 2) + prodIncrease;
	    var quadLinesHeight = (sH - 8) / quadLines;
	    var revC = piePieces.length - 1;
	    context.strokeStyle = '#E6E6E6';
	    for (var i = 1; i < quadLines; i++) {
	        context.moveTo(0, piePieces[revC].mainArrisY);
	        context.lineTo(piePieces[revC].mainArrisX, piePieces[revC].mainArrisY);

	        piePieces[revC].points.push({
	            x: piePieces[revC].mainArrisX,
	            y: piePieces[revC].mainArrisY
	        });
	        piePieces[revC].points.push({
	            x: 0,
	            y: piePieces[revC].mainArrisY
	        });
	        piePieces[revC].edges.push({
	            x1: 0,
	            y1: piePieces[revC].mainArrisY,
	            x2: piePieces[revC].mainArrisX,
	            y2: piePieces[revC].mainArrisY
	        });
	        piePieces[revC - 1].points.push({
	            x: piePieces[revC].mainArrisX,
	            y: piePieces[revC].mainArrisY
	        });
	        piePieces[revC - 1].points.push({
	            x: 0,
	            y: piePieces[revC].mainArrisY
	        });
	        piePieces[revC - 1].edges.push({
	            x1: 0,
	            y1: piePieces[revC].mainArrisY,
	            x2: piePieces[revC].mainArrisX,
	            y2: piePieces[revC].mainArrisY
	        });

	        //context.moveTo(148,i*quadLinesHeight+4);
	        //context.lineTo(piePieces[revC].mainArrisX,piePieces[revC].mainArrisY);
	        revC--;
	    }

	    if (prodNumber % 2 != 0) {
	        /*bottom line*/
	        piePieces[parseInt(prodNumber / 2)].points.push({
	            x: 0,
	            y: (sH - 4)
	        });
	        piePieces[parseInt(prodNumber / 2)].points.push({
	            x: (sW),
	            y: (sH - 4)
	        });
	        piePieces[parseInt(prodNumber / 2)].edges.push({
	            x1: 0,
	            y1: (sH - 4),
	            x2: (sW),
	            y2: (sH - 4)
	        });
	    }

	    /*Right Side Lines*/
	    for (var i = 1; i < quadLines; i++) {
	        context.moveTo((sW), piePieces[i].mainArrisY);
	        context.lineTo(piePieces[i].mainArrisX, piePieces[i].mainArrisY);

	        piePieces[i].points.push({
	            x: piePieces[i].mainArrisX,
	            y: piePieces[i].mainArrisY
	        });
	        piePieces[i].points.push({
	            x: (sW),
	            y: piePieces[i].mainArrisY
	        });
	        piePieces[i].edges.push({
	            x1: (sW),
	            y1: piePieces[i].mainArrisY,
	            x2: piePieces[i].mainArrisX,
	            y2: piePieces[i].mainArrisY
	        });
	        piePieces[i - 1].points.push({
	            x: piePieces[i].mainArrisX,
	            y: piePieces[i].mainArrisY
	        });
	        piePieces[i - 1].points.push({
	            x: (sW),
	            y: piePieces[i].mainArrisY
	        });
	        piePieces[i - 1].edges.push({
	            x1: (sW),
	            y1: piePieces[i].mainArrisY,
	            x2: piePieces[i].mainArrisX,
	            y2: piePieces[i].mainArrisY
	        });
	        //context.moveTo(606,i*quadLinesHeight+4);
	        //context.lineTo(piePieces[i].mainArrisX,piePieces[i].mainArrisY);
	    }


	    context.stroke();

	    canvas.onclick = function (e) {
	        // correct mouse coordinates:
	        var rect = canvas.getBoundingClientRect(),
	            x = e.clientX - rect.left,
	            y = e.clientY - rect.top,
	            i = 0,
	            piePiece, piePieceInContext;

	        while (piePiece = piePieces[i++]) {
	            context.beginPath();
	            context.lineWidth = 4;
	            context.strokeStyle = '#ffffff';
	            context.moveTo((sW / 2), (sH / 2));
	            var currX = piePiece.points[0].x; //piePiece.mainArrisX;
	            var currY = piePiece.points[0].y; //piePiece.mainArrisY;
	            context.lineTo(currX, currY);
	            var connectedPoints = [];
	            connectedPoints.push(currX + ',' + currY);
	            for (var j = 0; j < piePiece.points.length; j++) {
	                for (var m = 0; m < piePiece.points.length; m++) {
	                    if (
	                        (parseInt(currX) == parseInt(piePiece.points[m].x) || parseInt(currY) == parseInt(piePiece.points[m].y)) &&
	                        connectedPoints.indexOf(piePiece.points[m].x + ',' + piePiece.points[m].y) == -1
	                    ) {
	                        currX = piePiece.points[m].x;
	                        currY = piePiece.points[m].y;
	                        context.lineTo(currX, currY);
	                        connectedPoints.push(currX + ',' + currY);
	                    }
	                }
	            }
	            context.lineTo((sW / 2), (sH / 2));
	            context.closePath();

	            if (context.isPointInPath(x, y)) {
	                $(links[parseInt(piePiece.featureId.replace("features-", "")) - 1].anchor).find("a")[0].click();
	            }
	        }
	    }

	    // Hover Effect
	    canvas.onmousemove = function (e) {
	        $("#features-0").hide();
	        context.clearRect(0, 0, sW, sH);
	        // correct mouse coordinates:
	        var rect = canvas.getBoundingClientRect(),
	            x = e.clientX - rect.left,
	            y = e.clientY - rect.top,
	            i = 0,
	            piePiece, piePieceInContext;

	        while (piePiece = piePieces[i++]) {
	            for (var j = 0; j < piePiece.edges.length; j++) {
	                context.beginPath();
	                context.lineWidth = 4;
	                context.strokeStyle = '#E6E6E6';
	                context.moveTo(piePiece.edges[j].x1, piePiece.edges[j].y1);
	                context.lineTo(piePiece.edges[j].x2, piePiece.edges[j].y2);
	                context.stroke();
	            }
	        }
	        i = 0;
	        // check which circle:
	        while (piePiece = piePieces[i++]) {

	            context.beginPath();
	            context.lineWidth = 4;
	            context.strokeStyle = '#ffffff';
	            context.moveTo((sW / 2), (sH / 2));
	            var currX = piePiece.points[0].x; //piePiece.mainArrisX;
	            var currY = piePiece.points[0].y; //piePiece.mainArrisY;
	            context.lineTo(currX, currY);
	            var connectedPoints = [];
	            connectedPoints.push(currX + ',' + currY);
	            for (var j = 0; j < piePiece.points.length; j++) {
	                for (var m = 0; m < piePiece.points.length; m++) {
	                    if (
	                        (parseInt(currX) == parseInt(piePiece.points[m].x) || parseInt(currY) == parseInt(piePiece.points[m].y)) &&
	                        connectedPoints.indexOf(piePiece.points[m].x + ',' + piePiece.points[m].y) == -1
	                    ) {
	                        currX = piePiece.points[m].x;
	                        currY = piePiece.points[m].y;
	                        context.lineTo(currX, currY);
	                        connectedPoints.push(currX + ',' + currY);
	                    }
	                }
	            }
	            context.lineTo((sW / 2), (sH / 2));
	            context.closePath();

	            if (context.isPointInPath(x, y)) {
	                piePieceInContext = piePiece;
	                //fill
	                context.beginPath();
	                var currX = piePiece.points[0].x;
	                var currY = piePiece.points[0].y;
	                context.moveTo(currX, currY);
	                var connectedPoints = [];
	                connectedPoints.push(currX + ',' + currY);
	                for (var j = 0; j < piePiece.points.length; j++) {
	                    for (var m = 0; m < piePiece.points.length; m++) {
	                        if (
	                            (parseInt(currX) == parseInt(piePiece.points[m].x) || parseInt(currY) == parseInt(piePiece.points[m].y)) &&
	                            connectedPoints.indexOf(piePiece.points[m].x + ',' + piePiece.points[m].y) == -1
	                        ) {
	                            currX = piePiece.points[m].x;
	                            currY = piePiece.points[m].y;
	                            context.lineTo(currX, currY);
	                            connectedPoints.push(currX + ',' + currY);
	                        }
	                    }
	                }
	                context.lineTo(piePiece.mainArrisX, piePiece.mainArrisY);
	                context.closePath();
	                context.lineWidth = 4;
	                context.strokeStyle = '#ffffff';
	                //  context.fillStyle = '#00b050'; // for backgrounf color of the goof aqi//'#FEE7AB';
	                //borders
	                for (var j = 0; j < piePiece.edges.length; j++) {

	                    if (piePiece.featureId == "features-1") {
	                        context.strokeStyle = '#00b050'; // for good aqi border
	                        context.fillStyle = '#56bd85'; // for good aqi background color
	                    } else if (piePiece.featureId == "features-2") {
	                        context.strokeStyle = '#92d050'; // for Satisfactory aqi border
	                        context.fillStyle = '#b3e57f'; // for Satisfactory aqi background color
	                    } else if (piePiece.featureId == "features-3") {
	                        context.strokeStyle = '#FFFF00'; // for Moderate aqi border
	                        context.fillStyle = '#ffffc0'; // for Moderate aqi background color
	                    } else if (piePiece.featureId == "features-4") {
	                        context.strokeStyle = '#FF9900'; // for Poor aqi border
	                        context.fillStyle = '#ffc56e'; // for Poor aqi background color
	                    } else if (piePiece.featureId == "features-5") {
	                        context.strokeStyle = '#FF0000'; // for Very poor  aqi border
	                        context.fillStyle = '#fa8080'; // for Very poor aqi background color
	                    } else if (piePiece.featureId == "features-6") {
	                        context.strokeStyle = '#C00001'; // for Severe  aqi border
	                        context.fillStyle = '#ff3e3f'; // for Severe aqi background color
	                    } else {
	                        context.strokeStyle = '#F9B500'; // for good aqi border
	                        context.fillStyle = '#FEE7AB'; // for good aqi background color
	                    }

	                    context.fill();
	                    context.stroke();
	                    // context.strokeStyle = '#00b050'; //for good AQI//'#F9B500';   
	                    context.beginPath();
	                    context.lineWidth = 4;
	                    context.moveTo(piePiece.edges[j].x1, piePiece.edges[j].y1);
	                    context.lineTo(piePiece.edges[j].x2, piePiece.edges[j].y2);
	                    context.stroke();
	                }
	                context.strokeStyle = '#ffffff';

	                $("#" + piePiece.featureId).show();
	            } else {
	                $("#" + piePiece.featureId).hide();
	            }
	        }
	        i = 0;
	        while (piePiece = piePieces[i++]) {
	            context.beginPath();
	            context.lineWidth = 4;
	            context.strokeStyle = '#ffffff';
	            context.moveTo((sW / 2), (sH / 2));
	            context.arc((sW / 2), (sH / 2), extRadius, piePiece.startingPoint, piePiece.endingPoint);
	            if (piePieceInContext == piePiece) {
	                if (piePieceInContext.featureId == "features-1") {
	                    context.fillStyle = '#00b050'; //for good AQI border //"#F9B500";  
	                } else if (piePiece.featureId == "features-2") {

	                    context.fillStyle = '#92d050'; // for Satisfactory aqi border color
	                } else if (piePiece.featureId == "features-3") {

	                    context.fillStyle = '#FFFF00'; // for Moderate aqi background color
	                } else if (piePiece.featureId == "features-4") {

	                    context.fillStyle = '#FF9900'; // for Poor aqi background color
	                } else if (piePiece.featureId == "features-5") {

	                    context.fillStyle = '#FF0000'; // for Very poor aqi background color
	                } else if (piePiece.featureId == "features-6") {

	                    context.fillStyle = '#C00001'; // for Severe aqi background color
	                } else {

	                    context.fillStyle = '#FEE7AB'; // for good aqi background color
	                }


	                context.fill();
	                context.stroke();
	            } else {
	                context.fillStyle = "#E6E6E6";
	                context.fill();
	                context.stroke();
	                $("#" + piePiece.featureId).hide();
	            }
	        }
	        context.beginPath();
	        context.moveTo((sW / 2), (sH / 2));
	        radius = parseInt(extRadius * 0.86);
	        context.lineWidth = 0;
	        context.arc((sW / 2), (sH / 2), radius, 0, 2 * Math.PI);
	        context.fillStyle = "#FFFFFF";
	        context.fill();
	        context.lineWidth = 4;

	        context.moveTo((sW / 2), (smiddleL + 35));
	        context.lineTo((sW / 2), smiddleL);
	        context.stroke();
	        context.stroke();

	    }
	    $(".product-circle").mouseleave(function () {
	        var i = 0,
	            piePiece;
	        context.clearRect(0, 0, sW, sH);
	        while (piePiece = piePieces[i++]) {
	            for (var j = 0; j < piePiece.edges.length; j++) {
	                context.beginPath();
	                context.lineWidth = 4;
	                context.strokeStyle = '#E6E6E6';
	                context.moveTo(piePiece.edges[j].x1, piePiece.edges[j].y1);
	                context.lineTo(piePiece.edges[j].x2, piePiece.edges[j].y2);
	                context.stroke();
	            }
	        }
	        i = 0;
	        while (piePiece = piePieces[i++]) {
	            context.beginPath();
	            context.lineWidth = 4;
	            context.strokeStyle = '#ffffff';
	            context.moveTo((sW / 2), (sH / 2));
	            var currX = piePiece.points[0].x; //piePiece.mainArrisX;
	            var currY = piePiece.points[0].y; //piePiece.mainArrisY;
	            context.lineTo(currX, currY);
	            var connectedPoints = [];
	            connectedPoints.push(currX + ',' + currY);
	            for (var j = 0; j < piePiece.points.length; j++) {
	                for (var m = 0; m < piePiece.points.length; m++) {
	                    if (
	                        (parseInt(currX) == parseInt(piePiece.points[m].x) || parseInt(currY) == parseInt(piePiece.points[m].y)) &&
	                        connectedPoints.indexOf(piePiece.points[m].x + ',' + piePiece.points[m].y) == -1
	                    ) {
	                        currX = piePiece.points[m].x;
	                        currY = piePiece.points[m].y;
	                        context.lineTo(currX, currY);
	                        connectedPoints.push(currX + ',' + currY);
	                    }
	                }
	            }
	            context.lineTo((sW / 2), (sH / 2));
	            context.closePath();
	        }
	        i = 0;
	        while (piePiece = piePieces[i++]) {
	            context.beginPath();
	            context.lineWidth = 4;
	            context.strokeStyle = '#ffffff';
	            context.moveTo((sW / 2), (sH / 2));
	            context.arc((sW / 2), (sH / 2), extRadius, piePiece.startingPoint, piePiece.endingPoint);

	            context.fillStyle = "#E6E6E6";
	            context.fill();
	            context.stroke();
	        }
	        context.beginPath();
	        context.moveTo((sW / 2), (sH / 2));
	        radius = parseInt(extRadius * 0.86);
	        context.lineWidth = 0;
	        context.arc((sW / 2), (sH / 2), radius, 0, 2 * Math.PI);
	        context.fillStyle = "#FFFFFF";
	        context.fill();
	        context.lineWidth = 4;

	        context.moveTo((sW / 2), (smiddleL + 35));
	        context.lineTo((sW / 2), smiddleL);
	        context.stroke();
	        context.stroke();

	        $(".mousemove:visible").hide();
	        $("#features-0").show();
	    });

	    $("#features-0").show();

	}

	$(document).ready(function ($) {
	    // rotates product arrows on mobile when clicked
	    $(".feature-toggle").click(function () {
	        $(this).children('span').toggleClass('rotate90');
	    });

	    //Calculates slices for the clock
	    var slices = $(".product-circle h3 a").length;
	    if (slices != 0)
	        drawClock(slices);
	});
