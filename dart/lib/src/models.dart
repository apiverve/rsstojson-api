/// Response models for the RSS to JSON API.

/// API Response wrapper.
class RsstojsonResponse {
  final String status;
  final dynamic error;
  final RsstojsonData? data;

  /// Set only when the current plan locks one or more fields; null otherwise.
  final PremiumInfo? premium;

  RsstojsonResponse({
    required this.status,
    this.error,
    this.data,
    this.premium,
  });

  factory RsstojsonResponse.fromJson(Map<String, dynamic> json) => RsstojsonResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? RsstojsonData.fromJson(json['data']) : null,
    premium: json['premium'] != null ? PremiumInfo.fromJson(json['premium']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
    if (premium != null) 'premium': premium!.toJson(),
  };
}

/// Describes fields the current plan does not unlock. Locked fields arrive as null
/// in [data], and [lockedFields] names them (nested ones use dot paths).
class PremiumInfo {
  final String? message;
  final String? upgradeUrl;
  final List<String>? lockedFields;

  PremiumInfo({this.message, this.upgradeUrl, this.lockedFields});

  factory PremiumInfo.fromJson(Map<String, dynamic> json) => PremiumInfo(
    message: json['message'] as String?,
    upgradeUrl: json['upgrade_url'] as String?,
    lockedFields: (json['locked_fields'] as List?)?.map((e) => e.toString()).toList(),
  );

  Map<String, dynamic> toJson() => {
    if (message != null) 'message': message,
    if (upgradeUrl != null) 'upgrade_url': upgradeUrl,
    if (lockedFields != null) 'locked_fields': lockedFields,
  };
}

/// Response data for the RSS to JSON API.

class RsstojsonData {
  String? source;
  num? articles;
  bool? maxReached;
  List<RsstojsonDataFeedItem>? feed;

  RsstojsonData({
    this.source,
    this.articles,
    this.maxReached,
    this.feed,
  });

  factory RsstojsonData.fromJson(Map<String, dynamic> json) => RsstojsonData(
      source: json['source'],
      articles: json['articles'],
      maxReached: json['maxReached'],
      feed: (json['feed'] as List?)?.map((e) => RsstojsonDataFeedItem.fromJson(e)).toList(),
    );
}

class RsstojsonDataFeedItem {
  String? website;
  String? title;
  String? pubDate;
  String? description;
  String? link;

  RsstojsonDataFeedItem({
    this.website,
    this.title,
    this.pubDate,
    this.description,
    this.link,
  });

  factory RsstojsonDataFeedItem.fromJson(Map<String, dynamic> json) => RsstojsonDataFeedItem(
      website: json['website'],
      title: json['title'],
      pubDate: json['pubDate'],
      description: json['description'],
      link: json['link'],
    );
}

class RsstojsonRequest {
  String url;

  RsstojsonRequest({
    required this.url,
  });

  Map<String, dynamic> toJson() => {
      'url': url,
    };
}
