<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Booking Form HTML Template</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="../static/css/bootstrap.min.css" />

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="../static/css/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<div class="form-header">
							<h1>Book Your Flight</h1>
						</div>
						<form>
							<div class="form-group">
								<div class="form-checkbox">
									<label for="roundtrip">
										<input type="radio" id="roundtrip" name="flight-type">
										<span></span>Roundtrip
									</label>
									<label for="one-way">
										<input type="radio" id="one-way" name="flight-type">
										<span></span>One way
									</label>
									<label for="multi-city">
										<input type="radio" id="multi-city" name="flight-type">
										<span></span>Multi-City
									</label>
								</div>
							</div>
							<div class="form-group">
								<input class="form-control" type="text">
								<span class="form-label">Flying from</span>
							</div>
							<div class="form-group">
								<input class="form-control" type="text">
								<span class="form-label">Flying to</span>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<input class="form-control" type="date">
										<span class="form-label">Check In</span>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input class="form-control" type="date">
										<span class="form-label">Check Out</span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<select class="form-control">
											<option>Economy class</option>
											<option>Business class</option>
											<option>First class</option>
										</select>
										<span class="select-arrow"></span>
										<span class="form-label">Travel class</span>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<select class="form-control">
											<option>1</option>
											<option>2</option>
											<option>3</option>
										</select>
										<span class="select-arrow"></span>
										<span class="form-label">Adults</span>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<select class="form-control">
											<option>0</option>
											<option>1</option>
											<option>2</option>
										</select>
										<span class="select-arrow"></span>
										<span class="form-label">Children</span>
									</div>
								</div>
							</div>
							<div class="form-btn">
								<button class="submit-btn">Check availability</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script>
		$('.form-control').each(function () {
			floatedLabel($(this));
		});

		$('.form-control').on('input', function () {
			floatedLabel($(this));
		});

		function floatedLabel(input) {
			var $field = input.closest('.form-group');
			if (input.val()) {
				$field.addClass('input-not-empty');
			} else {
				$field.removeClass('input-not-empty');
			}
		}
	</script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>