declare module '@apiverve/rsstojson' {
  export interface rsstojsonOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface rsstojsonResponse {
    status: string;
    error: string | null;
    data: RSStoJSONData;
    code?: number;
  }


  interface RSStoJSONData {
      source:     string;
      articles:   number;
      maxReached: boolean;
      feed:       Feed[];
  }
  
  interface Feed {
      website:     Website;
      title:       string;
      pubDate:     string;
      description: string;
      link:        string;
  }
  
  enum Website {
      Nasa = "NASA",
  }

  export default class rsstojsonWrapper {
    constructor(options: rsstojsonOptions);

    execute(callback: (error: any, data: rsstojsonResponse | null) => void): Promise<rsstojsonResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: rsstojsonResponse | null) => void): Promise<rsstojsonResponse>;
    execute(query?: Record<string, any>): Promise<rsstojsonResponse>;
  }
}
