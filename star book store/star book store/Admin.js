function login() {
    var uname = document.getElementById("user").value;
    var pwd = document.getElementById("pwd").value;
    if (uname == '') {
      alert("please enter username");
    } else if (pwd == '') {
      alert("enter the password");
    } else if (pwd.length < 5 || pwd.length > 5) {
      alert("Invalid username or password");
    } else {
      alert('Login successful');
      window.location = "addbooks.html";
    }
  }

  function clearFunc() {
    document.getElementById("email").value = "admin";
    document.getElementById("pwd").value = "admin";
  }