
// mongoDB 설정
// var url = 'mongodb://localhost:27017/mentos';
// var dbObj = null;
// MongoClient.connect(url, function(err, db) {
//     console.log("Connected correctly to MongoDB server");
//     dbObj = db;
// });
// app.use(passport.initialize());
// app.use(passport.session());


var express = require('express');
var router = express.Router();

/* GET home page. */

router.get('/', function(req, res){
	if(!req.session.user){
		res.redirect('/login');
	}else{
		res.render('main', {name:req.session.user.c_name, c_no:req.session.user.c_no})
	}
});


// router.get('/', function(req, res) {

// 	if(!req.session.user)
// 		res.redirect('login');
//        var note = dbObj.collection('mentos');
// 	var no = req.session.user.c_no;
//        note.find({"c_no":no}).toArray(function(err,docs){
//            if(err) res.redirect('login');
//            else { // APPLICATION SIDE JOIN
//                res.render('main',{c_no: no, name: req.session.user.c_name});
//            }
//        });
// });

//jsontext:JSON.stringify(docs), 
// router.get('/',
// 	passport.authenticate('local',{
// 		failureRedirect:'/login',
// 		failureFlash: true}),
// 		function(req, res){
// 			res.render('main',{name : req.user.c_name});
// });


module.exports = router;
