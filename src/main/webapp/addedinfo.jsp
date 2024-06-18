<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Details</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .header {
      display: flex;
      justify-content: space-between;
      align-items: center;
      margin-bottom: 20px;
    }
    .buttons {
      display: flex;
      gap: 10px;
    }
    .card-title {
      color: #007bff;
    }
    .card-text {
      font-size: 1.2rem;
    }
  </style>
</head>
<body>
  <div class="container mt-5">
    <div class="header">
      <h1>Student Details</h1>
      <div class="buttons">
        <a class="btn btn-primary" href="index.jsp">Go Home</a>
        <a class="btn btn-secondary" href="addStudent.jsp">Add More</a>
      </div>
    </div>
    <div class="row">
      <div class="col-md-4">
        <div class="card mb-4">
          <div class="card-body">
            <h2 class="card-title">Roll No.</h2>
            <p class="card-text">${info.rno }</p>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card mb-4">
          <div class="card-body">
            <h2 class="card-title">Name</h2>
            <p class="card-text">${info.name }</p>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card mb-4">
          <div class="card-body">
            <h2 class="card-title">Branch</h2>
            <p class="card-text">${info.branch }</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
