$(function() {
  $("#datepicker").datepicker();
});
$(function() {
  var departure = [
    "Zagreb autobusni kolodvor",
    "Zagreb dubrava",
    "Sesvete",
    "Sesvetski kraljevec",
    "Dugo Selo",
    "Bozjakovina",
    "Ivanic Grad",
    "Bjelovar",
    "Vrbovec",
  ];
  $("#departure").autocomplete({
    source: departure

  });

});

$(function() {
  var arrive = [
    "Zagreb autobusni kolodvor",
    "Zagreb dubrava",
    "Sesvete",
    "Sesvetski kraljevec",
    "Dugo Selo",
    "Bozjakovina",
    "Ivanic Grad",
    "Bjelovar",
    "Vrbovec"
    ,
  ];
  $("#arrive").autocomplete({
    source: arrive

  });

});
