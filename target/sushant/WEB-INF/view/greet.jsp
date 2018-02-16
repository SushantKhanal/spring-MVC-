<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring 4 MVC Example</title>
    <link rel='stylesheet' href='<c:url value="/Resources/css/style.css" />' type='text/css' media='all' />
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>
    <script type="text/javascript" src="/Resources/js/app.js"></script>
</head>
<h1>Welcome to Spring MVC Based Application</h1>
<body ng-app="myApp">
<div>
    <%--${greet}--%>
    <%--Hello ${greet} Welcome!!!--%>
        <h1>Greeting : ${greeting}</h1>
</div>
<h2>Add things to your to-do list</h2>
<div ng-controller="myCtrl as xxx">
    <form name="frm" ng-submit="xxx.addTask()">
        <input type="text" name="newTodo" ng-model="xxx.newTodo" required/>
        <button ng-disabled="frm.$invalid">Submit</button>
    </form>
    <!--	{{ todoevent }}  -->

    <ul>
        <li ng-repeat = "todo in xxx.array1 track by $index ">
            <input type="checkbox" ng-model="todo.status" ng-change="xxx.updateChange()">
            <span ng-model="todo.title" contentEditable='false'
                  ng-dblclick="xxx.contentEdit(todo)" ng-keydown="xxx.pressEnter(todo)" ng-class="{'strike': todo.status}">
					 {{ todo.title }}
					</span>
        </li>
    </ul>

    <button ng-click="xxx.clearCompleted()">Clear Completed</button>


</div>

</body>
</html>