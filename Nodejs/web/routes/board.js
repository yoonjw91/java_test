var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function (req, res, next) {
    res.render('board', {c_no:req.session.user.c_no, name: req.session.user.c_name});
});

module.exports = router;
