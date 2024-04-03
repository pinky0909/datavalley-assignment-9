<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Departmental Store Customer Information</title>
</head>
<body>

  <h2>Customer Information Form</h2>

  <form action="#" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="phone">Contact Phone:</label><br>
    <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required><br><br>

    <label for="days">Preferred Days of Purchasing:</label><br>
    <input type="text" id="days" name="days"><br><br>

    <label for="item">Favorite Item:</label><br>
    <select id="item" name="item">
      <option value="groceries">Groceries</option>
      <option value="clothing">Clothing</option>
      <option value="electronics">Electronics</option>
      <option value="home_goods">Home Goods</option>
    </select><br><br>

    <label for="suggestions">Suggestions:</label><br>
    <textarea id="suggestions" name="suggestions" rows="4" cols="50"></textarea><br><br>

    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
  </form>

</body>
</html>
