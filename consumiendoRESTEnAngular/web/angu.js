angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/usuarios/all').
        then(function(response) {
            $scope.greeting = response.data;
        });
});