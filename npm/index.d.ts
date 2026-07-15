declare module '@apiverve/rsstojson' {
  export interface rsstojsonOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface rsstojsonResponse {
    status: string;
    error: string | null;
    data: RSStoJSONData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface RSStoJSONData {
      source:     null | string;
      articles:   number | null;
      maxReached: boolean | null;
      feed:       Feed[];
  }
  
  interface Feed {
      website:     Website | null;
      title:       null | string;
      pubDate:     null | string;
      description: null | string;
      link:        null | string;
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
