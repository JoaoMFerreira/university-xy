(function () {
  'use strict';

angular.module("ngApp").config( function($routeProvider) {
  $routeProvider
  // .when("/", {
  //     templateUrl : "index.html"
  // })
  .when("/aluno", {
      templateUrl : "views/aluno.htm",
      controller : "alunoCtrl"
  })
  .when("/curso", {
      templateUrl : "curso.htm",
      controller : "cursoCtrl"
  });
});

})();