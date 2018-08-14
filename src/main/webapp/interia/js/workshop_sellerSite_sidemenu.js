$.getJSON(serverRoot + "/json/workshop/listSellerSite", (data) => {
	console.log(data);
	console.log(data[0].lpath);
	$("<img src='../../../files/" + data[0].lpath + "'>"
	).appendTo(".workshop_sellerSite_sidemenu_img");
	$("<a href='../admin/store_admin_index.html'>" +
			"<h1>" + data[0].wsnm + "</h1>" +
			"</a>" +
			"<p>" + data[0].itrod + "</p>"
	).appendTo(".workshop_sellerSite_sidemenu_imgtext");
	$("<img src='../../../files/" + data[0].path + "'>"
	).appendTo(".workshop_sellerSite_content_visual");
	$("<img src='../../../files/" + data[0].lpath + "' style='width: 50px;'>"
	).appendTo(".snsbanner00_title_00");
	$("<p>" + data[0].wsnm + "</p>"
	).appendTo(".snsbanner00_title_01");
	$("<a href=" + data[0].fcbk + ">" +
			"<img src='../../images/workshop/facebook.png'>" +
	  "</a>"
	).appendTo(".workshop_sellerSite_sidemenu_snsbtn_bg");
	$("<a href=" + data[0].twit + ">" +
			"<img src='../../images/workshop/instagram.png'>" +
	  "</a>"
	).appendTo(".workshop_sellerSite_sidemenu_snsbtn_bg");
	$("<a href=" + data[0].istag + ">" +
			"<img src='../../images/workshop/twitter.png'>" +
	  "</a>"
	).appendTo(".workshop_sellerSite_sidemenu_snsbtn_bg");
});
