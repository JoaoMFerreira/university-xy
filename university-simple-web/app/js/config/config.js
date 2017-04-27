(function () {
  'use strict';

  angular.module("ngApp").config( function($routeProvider) {
    $routeProvider
    .when("/aluno", {
      templateUrl : "views/aluno.html",
      controller : "alunoCtrl",

    })
    .when("/curso", {
      templateUrl : "views/curso.html",
      controller : "cursoCtrl"
    }).otherwise({
      redirectTo: '/'
    });
  });

})();
