using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.RSStoJSON
{
    /// <summary>
    /// Query options for the RSS to JSON API
    /// </summary>
    public class RSStoJSONQueryOptions
    {
        /// <summary>
        /// The URL of the RSS feed you want converted into JSON format
        /// Example: https://www.nasa.gov/rss/dyn/breaking_news.rss
        /// </summary>
        [JsonProperty("url")]
        public string Url { get; set; }
    }
}
